package pattern_15_composite;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 节点类，也简单了很多
 * 我们先来说说组合模式的几个角色：
 * 抽象构件角色(Component)：定义参加组合的对象的共有方法和属性，可以定义一些默认的行为或属性；
 * 比如我们例子中的 getInfo 就封装到了抽象类中。
 * 叶子构件（Leaf）：叶子对象，其下再也没有其他的分支。
 * 树枝构件（Composite）：树枝对象，它的作用是组合树枝节点和叶子节点；
 * 组合模式有两种模式，透明模式和安全模式，这两个模式有什么区别呢？先看类图：
 * 组合模式的优点有哪些呢？第一个优点只要是树形结构，就要考虑使用组合模式，这个一定记住，只
 * 要是要体现局部和整体的关系的时候，而且这种关系还可能比较深，考虑一下组合模式吧。组合模式有一
 * 个非常明显的缺点，看到我们在 Client.java 中的的定义了树叶和树枝使用时的定义了吗？如下：
 * Branch developDep = new Branch("刘大瘸子","研发部门经理",10000);
 * …
 * Leaf g = new Leaf("g","开发人员",2000);
 * 发现什么问题了吗？直接使用了实现类！这个在面向接口编程上是很不恰当的，这个在使用的时候要考虑清
 * 楚。
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
 * 14.迭代器模式
 * 15.组合模式
 * 16.观察者模式
 *
 */
public class Branch extends Corp {
    //领导下边有那些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    //构造函数是必须的了
    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    //增加一个下属，可能是小头目，也可能是个小兵
    public void addSubordinate(Corp corp) {
        corp.setParent(this); // 设置父节点
        this.subordinateList.add(corp);
    }

    //我有哪些下属
    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
