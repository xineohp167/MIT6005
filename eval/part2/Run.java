import org.antlr.v4.runtime.tree.ParseTree;

public class Run{
	public static void main(String[] args) {
		final String str1 = "(3+5)*2";
		
		System.out.println(expr(str1));
	}
	
	private static Object expr(String expression) {
		ParseTree parseTree = ExpressionUtils.createParseTree(expression);
		return new ExpressionCalculatorVisitor()
			.visit(parseTree);
	}
}