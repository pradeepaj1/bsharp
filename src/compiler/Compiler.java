package compiler;

import main.antlr4.generatecode.BSharpLexer;
import main.antlr4.generatecode.BSharpParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Compiler {
    public static void main(String args[]) {
        System.out.println("compilation started.. ");

         BSharpLexer lexer = new BSharpLexer(CharStreams.fromString(readProgramFromFile()));
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         BSharpParser parser = new BSharpParser(tokens);
         ParseTree tree = ((BSharpParser) parser).writeStatement();
         System.out.println(tree);
         ParseTreeWalker walker = new ParseTreeWalker();
         BSharpListener listener= new BSharpListener();
         walker.walk(listener, tree);

    }
    private static String readProgramFromFile() {
        String program = null;
        try {
            program = FileUtils.readFileToString(
                    new File("data/sampleprogram1"), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return program;
    }
}