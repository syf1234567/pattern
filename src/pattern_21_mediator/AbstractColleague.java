package pattern_21_mediator;
/*
中介者模式简单，但是简单不代表容易使用，这是 23 个模式中最容被误用的模式。
*   1.策略模式
*   2.代理模式
*   3.单例模式
*   4.多例模式
*   5.工厂方法模式
*   6.抽象工厂模式
*   7.门面模式
*   8.适配模式
*   9.模板方法模式
*   10.建造者模式
*   11.桥梁模式
*   12.命令模式
*   13.装饰模式
*   14.迭代器模式
*   15.组合模式
*   16.观察者模式
*   17.责任链模式
*   18.访问者模式
*   19.状态模式
*   20.原型模式
*   21.中介者模式
*   22.解释器模式
* */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
