package pattern_22_interpreter;

import pattern_19_state.Context;

import java.util.HashMap;

/*解释器模式的优点
解释器是一个简单语法分析工具，它最显著的优点就是扩展性，修改语法规则只要修改相应的非终结
符表达式就可以了，若扩展语法，则只要增加非终结符类就可以了。
解释器模式的缺点
首先，解释器模式会引起类膨胀。每个语法都要产生一个非终结符表达式，语法规则比较复杂时，就
可能产生大量的类文件，为维护带来了非常多的麻烦。
一些重复发生的问题可以使用解释器模式。例如，多个应用服务器，每天产生大量的日志，需要对日
志文件进行分析处理，由于各个服务器的日志格式不同，但是数据元素都是相同的，按照解释器的说法就
是终结符表达式都是相同的，但是非终结符表达式就需要制定了，在这种情况下，可以通过程序来一劳永
逸的解决该问题。
        */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    //把左右两个表达式运算的结果加起来
    public int interpreter(HashMap<String, Integer> var) {
        return 1;
    }

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
