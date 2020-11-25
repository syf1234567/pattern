package pattern_07_facade;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我开始给朋友写信了
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 * 8.适配器模式
 */
public class Client {
    public static void main(String[] args) {

       /* //创建一个处理信件的过程
        LetterProcess letterProcess = new LetterProcessImpl();

        //开始写信
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");

        //开始写信封
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");

        //把信放到信封里，并封装好
        letterProcess.letterInotoEnvelope();

        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();*/
        //现代化的邮局，有这项服务，邮局名称叫Hell Road
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();

        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
        String address = "Happy Road No. 666,God Province,Heaven"; //定义一个地址
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        hellRoadPostOffice.sendLetter(context, address);

    }

}
