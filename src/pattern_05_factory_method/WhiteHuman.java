package pattern_05_factory_method;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 白色人类
 */

public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白色人类会大笑，侵略的笑声");
    }

    @Override
    public void cry() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节！");
    }
}
