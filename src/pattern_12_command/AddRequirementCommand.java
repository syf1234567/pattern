package pattern_12_command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 增加一项需求
 * 在这个类图中，我们看到三个角色：
 * Receiver 角色：这个就是干活的角色，命令传递到这里是应该被执行的，具体到上面我们的例子中就是
 * Group 的三个实现类；
 * Command 角色：就是命令，需要我执行的所有命令都这里声明；
 * Invoker 角色：调用者，接收到命令，并执行命令，例子中我这里项目经理就是这个角色；
 * 命令模式比较简单，但是在项目中使用是非常频繁的，封装性非常好，因为它把请求方（Invoker）和执
 * 行方（Receiver）分开了，扩展性也有很好的保障。但是，命令模式也是有缺点的，你看 Command 的子类没
 * 有，那个如果我要写下去的可不是几个，而是几十个，这个类膨胀的非常多，这个就需要大家在项目中自己考虑
 * 使用了。
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
 * 11.桥梁模式
 * 12.命令模式
 * 13.装饰模式
 *
 */
public class AddRequirementCommand extends Command {
    //执行增加一项需求的命令
    public void execute() {
//找到需求组
        super.rg.find();
//增加一份需求
        super.rg.add();
        // 页面也要增加
        super.pg.add();
// 功能也要增加
        super.cg.add();
//给出计划
        super.rg.plan();
    }
}
