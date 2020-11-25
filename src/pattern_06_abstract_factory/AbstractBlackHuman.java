package pattern_06_abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 黑色人类，记得中学学英语，老师说black man是侮辱人的意思，不懂，没跟老外说话
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 */
public abstract class AbstractBlackHuman implements Human  {
    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }
    @Override
    public void laugh() {
        System.out.println("黑人会笑");
    }
    @Override
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}
