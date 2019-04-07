package compiler;
import org.antlr.v4.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Compiler {
    public static void main(String args[]) {
        System.out.println("compilation started.. ");
        // String chatContent = "aj SAYS: hello\n";
        // ChatLexer chatLexer = new ChatLexer(CharStreams.fromString(chatContent));
        // CommonTokenStream tokens = new CommonTokenStream(chatLexer);
        // ChatParser parser = new ChatParser(tokens);
        // ParseTree tree = parser.chat();
        // System.out.println(tree);
        // ParseTreeWalker walker = new ParseTreeWalker();
        // ChatEvaluator listener= new ChatEvaluator();
        // walker.walk(listener, tree);

    }
}