package pattern_22_interpreter;

import pattern_19_state.Context;

public class TerminalExpression extends Expression {
    //通常终结符表达式只有一个，但是有多个对象
    public Object interpreter(Context ctx) {
        return null;
    }
}
