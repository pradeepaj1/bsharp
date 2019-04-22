package compiler;


import main.antlr4.generatecode.BSharpBaseListener;
import main.antlr4.generatecode.BSharpParser;
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
        intermediateCode.add("TYPE " + ctx.children.get(0) + " " + ctx.children.get(2));

        if (ctx.children.size() > 4) {
            intermediateCode.add("MOV ACC " + ctx.children.get(4));
            intermediateCode.add("MOV " +  ctx.children.get(2) + " " + "ACC");
        }

    }

    @Override
    public void exitDeclaration(BSharpParser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }

    @Override
    public void enterWriteStatement(BSharpParser.WriteStatementContext ctx) {
        super.enterWriteStatement(ctx);
        intermediateCode.add("WRITE" + " " + ctx.children.get(2));
    }

    @Override
    public void exitWriteStatement(BSharpParser.WriteStatementContext ctx) {
        super.exitWriteStatement(ctx);
    }

    @Override
    public void enterBSharp(BSharpParser.BSharpContext ctx) {
        super.enterBSharp(ctx);
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
        intermediateCode.add("TYPE ACC" + " " + ctx.children.get(0));
    }

    @Override
    public void exitLogicalOperator(BSharpParser.LogicalOperatorContext ctx) {
        super.exitLogicalOperator(ctx);
        intermediateCode.add("EXIT ACC");
    }

    @Override
    public void enterRelationalOperator(BSharpParser.RelationalOperatorContext ctx) {
        super.enterRelationalOperator(ctx);
        intermediateCode.add("TYPE ACC" + " " + ctx.children.get(0));
    }

    @Override
    public void exitRelationalOperator(BSharpParser.RelationalOperatorContext ctx) {
        super.exitRelationalOperator(ctx);
        intermediateCode.add("EXIT ACC");
    }
}