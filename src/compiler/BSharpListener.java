package compiler;


import generatedcode.BSharpBaseListener;
import generatedcode.BSharpParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BSharpListener extends BSharpBaseListener {

    private static List<String> intermediateCode = new ArrayList<String>();

    @Override
    public void enterDeclaration(BSharpParser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);

        intermediateCode.add("TYPE " + ctx.getChild(0) + " " + ctx.getChild(2));

        /* declaration with initialization */
        if (ctx.children.size() > 4) {
            intermediateCode.add("MOV ACC " + ctx.getChild(4));
            intermediateCode.add("MOV " + ctx.getChild(2) + " " + "ACC");
        }
    }

    @Override
    public void exitDeclaration(BSharpParser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }


    @Override
    public void enterWriteStatement(BSharpParser.WriteStatementContext ctx) {
        super.enterWriteStatement(ctx);
        intermediateCode.add("WRITE" + " " + ctx.getChild(2));
    }

    boolean isTempRegUsed = false;

    @Override
    public void exitArithmeticExpression(BSharpParser.ArithmeticExpressionContext ctx) {
        super.exitArithmeticExpression(ctx);
        if (ctx.op != null) {
            String left = ctx.left.children.size() == 1 ?
                    ctx.left.getChild(0).getText()
                    : "X";
            String right = ctx.right.children.size() == 1 ?
                    ctx.right.getChild(0).getText()
                    : "Y";
            String operator = getOperatorIntermediateCode(ctx.op.getText());
            intermediateCode.add(operator + " ACC " + left + " " + right);

            if (!isTempRegUsed) {
                intermediateCode.add("MOV "+ "X " + "ACC");
                isTempRegUsed = true;
            } else {
                if (left.equals("X") && !right.equals("Y")) {
                    intermediateCode.add("MOV "+ "X " + "ACC");
                } else {
                    intermediateCode.add("MOV "+ "Y " + "ACC");
                }
                isTempRegUsed = false;
            }

        }
    }

    private String getOperatorIntermediateCode(String operator) {
        String operatorIntermediateCode = null;
        if(operator.equals("+"))
        {
            operatorIntermediateCode = "ADD";
        }
        else if(operator.equals("-"))
        {
            operatorIntermediateCode = "SUB";
        }
        else if(operator.equals("*"))
        {
            operatorIntermediateCode = "MUL";
        }
        else if(operator.equals("/"))
        {
            operatorIntermediateCode = "DIV";
        }
        return operatorIntermediateCode;
    }

    @Override
    public void exitBSharp(BSharpParser.BSharpContext ctx) {
        super.exitBSharp(ctx);
        try {
            FileUtils.writeLines(new File("data/s.intermediate"), intermediateCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterAssignmentStatement(BSharpParser.AssignmentStatementContext ctx) {
        super.enterAssignmentStatement(ctx);
//        if(ctx.children.size() == 3)
//        {
//            if (ctx.children.get(2) instanceof BSharpParser.ArithmeticExpressionContext){
////                intermediateCode.add("MOV ACC " + ctx.children.get(2).getChild(0));
////                intermediateCode.add("MOV " + ctx.children.get(0) + " " + "ACC");
//            }
//        }
//        else
//        {
//            intermediateCode.add("TYPE "+ctx.children.get(0)+" "+ctx.children.get(2));
//            intermediateCode.add("MOV ACC " + ctx.children.get(4));
//            intermediateCode.add("MOV " + ctx.children.get(2) + " " + "ACC");
//        }

    }

    @Override
    public void exitAssignmentStatement(BSharpParser.AssignmentStatementContext ctx) {
        super.exitAssignmentStatement(ctx);
        intermediateCode.add("MOV "+ ctx.children.get(0) + " ACC");
    }

    @Override
    public void enterBoolAssignment(BSharpParser.BoolAssignmentContext ctx) {
        super.enterBoolAssignment(ctx);
        if(ctx.children.size() == 3)
        {
            intermediateCode.add("MOV ACC " + ctx.children.get(2));
            intermediateCode.add("MOV " + ctx.children.get(0) + " " + "ACC");
        }
        else {
            intermediateCode.add("TYPE "+ctx.children.get(0)+" "+ctx.children.get(2));
            intermediateCode.add("MOV ACC " + ctx.children.get(4));
            intermediateCode.add("MOV " + ctx.children.get(2) + " " + "ACC");
        }
    }

    @Override
    public void exitBoolAssignment(BSharpParser.BoolAssignmentContext ctx) {
        super.exitBoolAssignment(ctx);
    }


    @Override
    public void exitLogicalExpression(BSharpParser.LogicalExpressionContext ctx) {
        super.exitLogicalExpression(ctx);
    }


    public void enterConditionalStatement(BSharpParser.ConditionalStatementContext ctx) {
        super.enterConditionalStatement(ctx);
        intermediateCode.add("BEGIN IF" + " " + ctx.children.get(2));
    }

    @Override
    public void exitConditionalStatement(BSharpParser.ConditionalStatementContext ctx) {
        super.exitConditionalStatement(ctx);
        intermediateCode.add("END IF");
    }

    @Override
    public void enterLogicalOperator(BSharpParser.LogicalOperatorContext ctx) {
        super.enterLogicalOperator(ctx);
        intermediateCode.add("LOGICAL_OP_COMPARE" + " " + ctx.children.get(0));
        if (ctx.children.get(0).equals("&&")){
            intermediateCode.add("AND_CHECK");
        }
        else if (ctx.children.get(0).getText().equals("||")){
            intermediateCode.add("OR_CHECK");
        }
        else if (ctx.children.get(0).getText().equals("!")){
            intermediateCode.add("NEGATION_CHECK");
        }
    }

    @Override
    public void exitLogicalOperator(BSharpParser.LogicalOperatorContext ctx) {
        super.exitLogicalOperator(ctx);
        intermediateCode.add("EXIT LOG_OP");
    }


    @Override
    public void enterRelationalOperator(BSharpParser.RelationalOperatorContext ctx) {
        super.enterRelationalOperator(ctx);
        intermediateCode.add("RELATIONAL_OP_COMPARE" + " " + ctx.children.get(0));
        if (ctx.children.get(0).equals(">")){
            intermediateCode.add("GREATER_THAN_CHECK");
        }
        else if (ctx.children.get(0).equals("<")){
            intermediateCode.add("LESS_THAN_CHECK");
        }
        else if (ctx.children.get(0).equals(">=")){
            intermediateCode.add("GREATER_THAN_EQUAL_CHECK");
        }
        else if (ctx.children.get(0).equals("<=")){
            intermediateCode.add("LESSER_THAN_EQUAL_CHECK_CHECK");
        }
        else if (ctx.children.get(0).equals("==")){
            intermediateCode.add("EQUAL_TO_CHECK");
        }
        else if (ctx.children.get(0).equals("!=")){
            intermediateCode.add("NOT_EQUAL_CHECK");
        }
    }

    @Override
    public void exitRelationalOperator(BSharpParser.RelationalOperatorContext ctx) {
        super.exitRelationalOperator(ctx);
        intermediateCode.add("EXIT REL_OP");
    }

    @Override
    public void enterWhileStatement(BSharpParser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
        intermediateCode.add("BEGIN WHILE" + " " + ctx.children.get(2));
    }

    @Override
    public void exitWhileStatement(BSharpParser.WhileStatementContext ctx) {
        super.exitWhileStatement(ctx);
        intermediateCode.add("END WHILE");
    }

    @Override
    public void enterRelationalExpression(BSharpParser.RelationalExpressionContext ctx) {
        super.enterRelationalExpression(ctx);
        intermediateCode.add("ENTER REL EX" + " " + ctx.children.get(0));
    }


    @Override
    public void exitRelationalExpression(BSharpParser.RelationalExpressionContext ctx) {
        super.exitRelationalExpression(ctx);
        intermediateCode.add("EXIT REL EX");
    }
}