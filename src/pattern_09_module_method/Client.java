package pattern_09_module_method;
/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 客户开始使用这个模型
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 * 8.适配者模式
 * 9.模板方法模式
 * 10.建造者模式
 */
public class Client {
    public static void main(String[] args) {
        //客户开着H1型号，出去遛弯了
        HummerModel h1 = new HummerH1Model();
        h1.run(); //汽车跑起来了；

        //客户开H2型号，出去玩耍了
        HummerModel h2 = new HummerH2Model();
        h2.run();
    }

}
