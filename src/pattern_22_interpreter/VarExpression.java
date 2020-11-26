package pattern_22_interpreter;

import pattern_19_state.Context;

import java.util.HashMap;

public class VarExpression extends Expression {
    private String key;

    public VarExpression(String _key) {
        this.key = _key;
    }

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
