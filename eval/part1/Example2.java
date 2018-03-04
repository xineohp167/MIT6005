import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Example2 {
	
	public static void main(String[] args) throws ScriptException {
		String expr = "a < b";
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("ecmascript");
		CompiledScript compiledScript = ((Compilable) scriptEngine).compile(expr);
		Bindings bindings = scriptEngine.createBindings();
		bindings.put("a", 30);
		bindings.put("b", 25);
		Object result = compiledScript.eval(bindings);
		System.out.println("result = " + result + " (" + result.getClass().getName() + ")");
	}

}
