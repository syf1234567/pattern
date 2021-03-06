package pattern_19_state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 模拟电梯的动作
 * 状态模式中有什么优点呢？首先是避免了过多的 swith…case 或者 if..else 语句的使用，避免了程序
 * 的复杂性；其次是很好的使用体现了开闭原则和单一职责原则，每个状态都是一个子类，你要增加状态就
 * 增加子类，你要修改状态，你只修改一个子类就可以了；最后一个好处就是封装性非常好，这也是状态模
 * 式的基本要求，状态变换放置到了类的内部来实现，外部的调用不用知道类内部如何实现状态和行为的变
 * 换。
 * 状态模式
 * 既然有优点，那当然有缺点了，只有一个缺点，子类会太多，也就是类膨胀，你想一个事物
 * 有七八、十来个状态也不稀奇，如果完全使用状态模式就会有太多的子类，不好管理，这个需要大家在项
 * 目自己衡量。其实有很大方式解决这个状态问题，比如在数据库中建立一个状态表，然后根据状态执行相
 * 应的操作，这个也不复杂，看大家的习惯和嗜好了。
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 * 8.适配器模式
 * 9.模板方法模式
 * 10.建造者模式
 * 11.桥梁模式
 * 12.命令模式
 * 13.装饰模式
 * 14.迭代器模式
 * 15.组合模式
 * 16.观察者模式
 * 17.责任链模式
 * 18.访问者模式
 * 19.状态模式
 * 20.原型模式
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
