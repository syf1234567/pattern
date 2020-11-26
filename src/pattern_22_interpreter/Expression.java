package pattern_22_interpreter;

import pattern_19_state.Context;

import java.util.HashMap;

public abstract class Expression {
    //每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
}
