package compiler;


import main.antlr4.generatecode.BSharpBaseListener;
import main.antlr4.generatecode.BSharpParser;

public class DeclarationListener extends BSharpBaseListener {
    @Override
    public void enterDeclaration(BSharpParser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);
        System.out.print(ctx);
    }

    @Override
    public void enterWriteStatement(BSharpParser.WriteStatementContext ctx) {
        super.enterWriteStatement(ctx);
    }


}
