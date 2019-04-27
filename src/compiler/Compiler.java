package compiler;

import bSharp.BSharpLexer;
import bSharp.BSharpParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

/**
 * The {@code Compiler} class compiles the bSharp language sourcecode
 * and generates intermediate code
 * @author Harika Kolli
 * @author Sneha Lakshmi Narasimhan
 * @version 1.0
 * created on Mar 1, 2019
 */

public class Compiler {

    public static void main(String args[]) {
        String sourceCodeFilePath;
        if(args.length==0) {
            sourceCodeFilePath = "data/defaultprogram.bsharp";
        }
        else {
            sourceCodeFilePath = args[0];
        }
        compile(sourceCodeFilePath);
    }

    private static void compile(String sourceCodeFilePath) {
        System.out.println("Compilation Started...");
        BSharpLexer lexer = new BSharpLexer(CharStreams.fromString(readProgramFromFile(sourceCodeFilePath)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BSharpParser parser = new BSharpParser(tokens);
        ParseTree tree = parser.bSharp();
        ParseTreeWalker walker = new ParseTreeWalker();
        BSharpListener listener = new BSharpListener(sourceCodeFilePath);
        walker.walk(listener, tree);
    }

    private static String readProgramFromFile(String path) {
        String program = null;
        try {
            program = FileUtils.readFileToString(
                    new File(path), "UTF-8");
        } catch (IOException e) {
            System.out.println("Error in accessing the file.");
        }
        return program;
    }
}