package compiler;

import bSharp.BSharpLexer;
import bSharp.BSharpParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Compiler {
    public static String fileName=null;
    public static void main(String args[]) {
        String path;
        if(args.length==0)
        {
            path = "data/sampleprogram1";
        }
        else
        {
            path = args[0];
        }

        System.out.println("compilation started... ");

        BSharpLexer lexer = new BSharpLexer(CharStreams.fromString(readProgramFromFile(path)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BSharpParser parser = new BSharpParser(tokens);

        ParseTree tree = parser.bSharp();
        ParseTreeWalker walker = new ParseTreeWalker();
        BSharpListener listener = new BSharpListener(path);
        walker.walk(listener, tree);
    }


    private void compile() {

    }

    private static String readProgramFromFile(String path) {
        String program = null;
        try {
            program = FileUtils.readFileToString(
                    new File(path), "UTF-8");
        } catch (IOException e) {
            System.out.println("FILE NOT FOUND...PLEASE GIVE A CORRECT FILE PATH");
        }
        return program;
    }
}