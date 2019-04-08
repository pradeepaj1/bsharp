package compiler;

import main.antlr4.generatecode.BSharpLexer;
import main.antlr4.generatecode.BSharpParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class Compiler {
    public static void main(String args[]) {
        System.out.println("compilation started.. ");


         String testStatement = "write \"hel llo_\";";
         BSharpLexer lexer = new BSharpLexer(CharStreams.fromString(testStatement));
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         BSharpParser parser = new BSharpParser(tokens);
         ParseTree tree = ((BSharpParser) parser).writeStatement();
         System.out.println(tree);
         ParseTreeWalker walker = new ParseTreeWalker();
         DeclarationListener listener= new DeclarationListener();
         walker.walk(listener, tree);

    }
}