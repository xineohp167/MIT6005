import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Should I cache parseTree for repeating use? Example: "(three + 5) / 3"
 * 1M parse+visit: ~9.8 s; 1M visit <0.7 s
 * Yes, we should cache it, otherwise parsing may take ~93%
 * Note that this depends on visit logic - the more complex it is, the lower the "savings",
 * but in any case they are substantial.
 */
public class RunMain {
	
	private static ExpressionVariableResolver variableResolver = var -> null;;

	public static void main(String[] args) {
		String str1 = "(1 + 5) / 3 = 2";
		Object obj = expr(str1);
		System.out.println(obj);
		String str2 = "(1+5) / 2";
		System.out.println(expr(str2));
		variableResolver = var -> 2;
		System.out.println(expr("var = (1+5) / 2"));//false
		System.out.println(expr("var = (1+5) / 3"));//true
		
	}

	

	private static Object expr(String expression) {
		ParseTree parseTree = ExpressionUtils.createParseTree(expression);
		return new ExpressionCalculatorVisitor(variableResolver)
			.visit(parseTree);
	}
}
