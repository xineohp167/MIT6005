import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Run {
    public static void main(String[] args) throws Exception {
    	/*
    	 * a = 1+2
		   b = a^2
		   c = a + b * (a - 1)
		   a + b + c
		   Result should be equal 33.0
    	 */
        final String inp = "a = 1+2\nb = a^2\nc = a + b * (a - 1)\na + b + c";
        ANTLRInputStream input = new ANTLRInputStream(inp);
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();

        CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
        Double result = calcVisitor.visit(tree);
        System.out.println("Result: " + result);
    }
}
