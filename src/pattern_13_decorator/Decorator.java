package pattern_13_decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 装饰类，我要把我的成绩单装饰一下
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 * 8.适配者模式
 * 9.模板方法模式
 * 10.建筑者模式
 * 11.桥梁模式
 * 12.命令模式
 * 13.修饰者模式
 * 14.迭代器模式
 */

public class Decorator extends SchoolReport{
    //首先我要知道是那个成绩单
    private SchoolReport sr;
    //构造函数，传递成绩单过来
    public Decorator(SchoolReport sr){
        this.sr = sr;
    }
    //成绩单还是要被看到的
    @Override
    public void report(){
        this.sr.report();
    }
    //看完毕还是要签名的
    public void sign(String name){
        this.sr.sign(name);
    }
}
