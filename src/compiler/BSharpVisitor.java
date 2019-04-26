package compiler;

import generatedcode.BSharpBaseVisitor;
import generatedcode.BSharpParser;

public class BSharpVisitor extends BSharpBaseVisitor {


    @Override
    public Object visitBSharp(BSharpParser.BSharpContext ctx) {
        return super.visitBSharp(ctx);
    }

    @Override
    public String visitWriteStatement(BSharpParser.WriteStatementContext ctx) {
        return "hell";
    }


    @Override
    public Object visitAssignmentStatement(BSharpParser.AssignmentStatementContext ctx) {


        String var = ctx.getChild(0).getText();
        String ev = null;
        if (ctx.getChild(2) instanceof BSharpParser.ArithmeticExpressionContext) {
           visitArithmeticExpression(ctx.arithmeticExpression());
        }

        if (ctx.getChild(2) instanceof BSharpParser.BooleanExpressionContext) {
            visitBooleanExpression(ctx.booleanExpression());
        }

        return null;
    }

    @Override
    public String visitArithmeticExpression(BSharpParser.ArithmeticExpressionContext ctx) {

        if (ctx == null)
            return null;
        return null;
    }
}
