package pattern_22_interpreter;

import pattern_19_state.Context;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {
    public SubExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
