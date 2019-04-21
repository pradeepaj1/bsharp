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
            intermediateCode.add("MOV " + ctx.children.get(2) + " " + "ACC");
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
    public void enterAssignmentStatement(BSharpParser.AssignmentStatementContext ctx) {
        super.enterAssignmentStatement(ctx);
        if(ctx.children.size() == 3)
        {
            intermediateCode.add("MOV ACC " + ctx.children.get(2));
            intermediateCode.add("MOV " + ctx.children.get(0) + " " + "ACC");
        }
        else
        {
            intermediateCode.add("TYPE "+ctx.children.get(0)+" "+ctx.children.get(2));
            intermediateCode.add("MOV ACC " + ctx.children.get(4));
            intermediateCode.add("MOV " + ctx.children.get(2) + " " + "ACC");
        }

    }

    @Override
    public void exitAssignmentStatement(BSharpParser.AssignmentStatementContext ctx) {
        super.exitAssignmentStatement(ctx);
    }

    @Override
    public void enterBoolAssignment(BSharpParser.BoolAssignmentContext ctx) {
        super.enterBoolAssignment(ctx);
        if(ctx.children.size() == 3)
        {
            intermediateCode.add("MOV ACC " + ctx.children.get(2));
            intermediateCode.add("MOV " + ctx.children.get(0) + " " + "ACC");
        }
        else
        {
            intermediateCode.add("TYPE "+ctx.children.get(0)+" "+ctx.children.get(2));
            intermediateCode.add("MOV ACC " + ctx.children.get(4));
            intermediateCode.add("MOV " + ctx.children.get(2) + " " + "ACC");
        }

    }

    @Override
    public void exitBoolAssignment(BSharpParser.BoolAssignmentContext ctx) {
        super.exitBoolAssignment(ctx);
    }
}