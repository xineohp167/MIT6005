import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Part1{
	
	public static void main(String[] args) throws ScriptException {
		String expr = "1+1*2";
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("ecmascript");
		CompiledScript compiledScript = ((Compilable) scriptEngine).compile(expr);
		Object result = compiledScript.eval();
		System.out.println("result = " + result + " (" + result.getClass().getName() + ")");
	}
}