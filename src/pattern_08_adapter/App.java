package pattern_08_adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 这就是我们具体的应用了，比如老板要查所有的20-30的女性信息
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 * 8.适配器模式
 * 9.模板方法模式
 */
public class App {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        //IUserInfo youngGirl = new UserInfo();

        //老板一想不对呀，兔子不吃窝边草，还是找人力资源的员工好点
        IUserInfo youngGirl = new OuterUserInfo(); //我们只修改了这一句好
        //从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }


    }
}
