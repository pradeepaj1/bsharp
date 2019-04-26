package compiler;

import generatedcode.BSharpBaseListener;
import generatedcode.BSharpParser;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BSharpListener extends BSharpBaseListener {

    private static List<String> intermediateCode = new ArrayList<String>();
    private boolean isTempRegUsed = false;
    private boolean isLogicalTemp = false;

    @Override
    public void enterDeclaration(BSharpParser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);

        intermediateCode.add("TYPE " + ctx.getChild(0) + " " + ctx.getChild(1));

        /* declaration with initialization */
        if (ctx.children.size() > 3) {
            intermediateCode.add("MOV ACC " + ctx.getChild(3));
            intermediateCode.add("MOV " + ctx.getChild(1) + " " + "ACC");
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

    @Override
    public void exitArithmeticExpression(BSharpParser.ArithmeticExpressionContext ctx) {
        super.exitArithmeticExpression(ctx);
        if (ctx.op != null) {
            String left = ctx.left.children.size() == 1 && ctx.left.getChild(0) instanceof TerminalNodeImpl ?
                    ctx.left.getChild(0).getText()
                    : "X";
            String right = ctx.right.children.size() == 1 && ctx.right.getChild(0) instanceof TerminalNodeImpl ?
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
    public void exitAssignmentStatement(BSharpParser.AssignmentStatementContext ctx) {
        super.exitAssignmentStatement(ctx);
        if (ctx.getChild(2) instanceof TerminalNodeImpl) {
            intermediateCode.add("MOV "+ ctx.children.get(0) + " " + ctx.getChild(2));
        } else {
            intermediateCode.add("MOV "+ ctx.children.get(0) + " ACC");
        }
        isTempRegUsed = false;
    }

    @Override
    public void enterBlockOfStatements(BSharpParser.BlockOfStatementsContext ctx) {
        super.enterBlockOfStatements(ctx);
        if(ctx.parent instanceof BSharpParser.IfBlockContext ||
                ctx.parent instanceof BSharpParser.WhileStatementContext ){
            intermediateCode.add("END_CONDITION");
        }
        isLogicalTemp = false;
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
            intermediateCode.add("TYPE "+ ctx.children.get(0)+" "+ctx.children.get(2));
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
        if (ctx.op != null) {
                String left = ctx.left.children.size() == 1 && ctx.left.getChild(0) instanceof TerminalNodeImpl ?
                        ctx.left.getChild(0).getText()
                        : "X";
                String right = ctx.right.children.size() == 1 && ctx.right.getChild(0) instanceof TerminalNodeImpl ?
                        ctx.right.getChild(0).getText()
                        : "Y";
                String logicalOperator = getLogicalOperatorIntermediateCode(ctx.op.getText());
                intermediateCode.add(logicalOperator + " ACC " + left + " " + right);

                if (!isLogicalTemp) {
                    intermediateCode.add("MOV "+ "X " + "ACC");
                    isLogicalTemp = true;
                } else {
                    if (left.equals("X") && !right.equals("Y")) {
                        intermediateCode.add("MOV "+ "X " + "ACC");
                    } else {
                        intermediateCode.add("MOV "+ "Y " + "ACC");
                    }
                    isLogicalTemp = false;
                }
            }
        intermediateCode.add("END LOGICAL_EXPRESSION");
    }

    public void enterConditionalStatement(BSharpParser.ConditionalStatementContext ctx) {
        super.enterConditionalStatement(ctx);
        intermediateCode.add("START_IF_ELSE_BLOCK");
    }

    @Override
    public void enterIfBlock(BSharpParser.IfBlockContext ctx) {
        super.enterIfBlock(ctx);
        intermediateCode.add("IF_BLOCK_STARTS");
        intermediateCode.add("CONDITION_START");
    }

    @Override
    public void exitIfBlock(BSharpParser.IfBlockContext ctx) {
        super.exitIfBlock(ctx);
        intermediateCode.add("IF_BLOCK_ENDS");
    }

    @Override
    public void enterElseBlock(BSharpParser.ElseBlockContext ctx) {
        super.enterElseBlock(ctx);
        intermediateCode.add("ELSE_BLOCK_STARTS");
    }

    @Override
    public void exitElseBlock(BSharpParser.ElseBlockContext ctx) {
        super.exitElseBlock(ctx);
        intermediateCode.add("ELSE_BLOCK_ENDS");
    }

    @Override
    public void exitConditionalStatement(BSharpParser.ConditionalStatementContext ctx) {
        super.exitConditionalStatement(ctx);
        intermediateCode.add("END_IF_ELSE_BLOCK");
    }


    private String getLogicalOperatorIntermediateCode(String logicalOperator) {
        String logicalOperatorIntermediateCode = null;
        if(logicalOperator.equals("&&"))
        {
            logicalOperatorIntermediateCode = "AND";
        }
        else if(logicalOperator.equals("||"))
        {
            logicalOperatorIntermediateCode = "OR";
        }
        else if(logicalOperator.equals("!"))
        {
            logicalOperatorIntermediateCode = "NOT";
        }
        return logicalOperatorIntermediateCode;
    }

    @Override
    public void exitRelationalExpression(BSharpParser.RelationalExpressionContext ctx) {
        super.exitRelationalExpression(ctx);
         if (ctx.op != null) {
                String left = ctx.left.children.size() == 1 && ctx.left.getChild(0) instanceof TerminalNodeImpl ?
                        ctx.left.getChild(0).getText()
                        : "X";
                String right = ctx.right.children.size() == 1 && ctx.right.getChild(0) instanceof TerminalNodeImpl ?
                        ctx.right.getChild(0).getText()
                        : "Y";
                String logicalOperator = getRelationalOperatorIntermediateCode(ctx.op.getText());
                intermediateCode.add(logicalOperator + " ACC " + left + " " + right);

                if (!isLogicalTemp) {
                    intermediateCode.add("MOV "+ "X " + "ACC");
                    isLogicalTemp = true;
                } else {
                    if (left.equals("X") && !right.equals("Y")) {
                        intermediateCode.add("MOV "+ "X " + "ACC");
                    } else {
                        intermediateCode.add("MOV "+ "Y " + "ACC");
                    }
                    isLogicalTemp = false;
                }
            }
        }

    private String getRelationalOperatorIntermediateCode(String relOperator) {
        String relationalOperatorIntermediateCode = null;
        if(relOperator.equals("<"))
        {
            relationalOperatorIntermediateCode = "LESS_THAN";
        }
        else if(relOperator.equals(">"))
        {
            relationalOperatorIntermediateCode = "GREATER_THAN";
        }
        else if(relOperator.equals("<="))
        {
            relationalOperatorIntermediateCode = "LESS_THAN_EQUAL_TO";
        }
        else if(relOperator.equals(">="))
        {
            relationalOperatorIntermediateCode = "GREATER_THAN_EQUAL_TO";
        }
        else if(relOperator.equals("=="))
        {
            relationalOperatorIntermediateCode = "DOUBLE_EQUAL_TO";
        }
        else if(relOperator.equals("!="))
        {
            relationalOperatorIntermediateCode = "NOT_EQUAL_TO";
        }
        return relationalOperatorIntermediateCode;
    }

    @Override
    public void enterWhileStatement(BSharpParser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
        intermediateCode.add("BEGIN_WHILE");
        intermediateCode.add("BEGIN_CONDITION");
    }

    @Override
    public void exitWhileStatement(BSharpParser.WhileStatementContext ctx) {
        super.exitWhileStatement(ctx);
        intermediateCode.add("END_WHILE");
    }
}