package pattern_20_protobyte;

/*这个模式的核心是一个 clone 方法，通过这个方法进行对象的拷贝，Java 提供了一个 Cloneable 接口
        来标示这个对象是可拷贝的
1.策略模式
2.代理模式
3.单例模式
4.多例模式
5.工厂方法模式
6.抽象工厂模式
7.门面模式
8.适配者模式
9.模板方法模式
10.建造者模式
11.桥梁模式
12.命令模式
13.装饰模式
14.迭代器模式
15.组合模式
16.观察者模式
17.责任链模式
18.访问者模式
19.状态模式
20.原型模式
21.中介者模式

        */
public class AdvTemplate {
    //广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    //广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你1百万！....";

    //取得广告信的名称
    public String getAdvSubject() {
        return this.advSubject;
    }

    //取得广告信的内容
    public String getAdvContext() {
        return this.advContext;
    }
}
