package pattern_18_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 访问者模式还有一个用途，就是充当拦截器（Interceptor）角色，这个我们在后边来讲。
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 * 8.适配器模式
 * 9.模板方法模式
 * 10.建造者模式
 * 11.桥梁模式
 * 12.命令模式
 * 13.装饰模式
 * 14.迭代器模式
 * 15.组合模式
 * 16.观察者模式
 * 17.责任链模式
 * 18.访问者模式
 * 19.状态模式
 */
public class Client {
    public static void main(String[] args) {
        // 展示报表访问者
        IShowVisitor showVisitor = new ShowVisitor();
// 汇总报表的访问者
        ITotalVisitor totalVisitor = new TotalVisitor();
        for (Employee emp : mockEmployee()) {
            emp.accept(showVisitor); // 接受展示报表访问者
            emp.accept(totalVisitor);// 接受汇总表访问者
        }
// 展示报表
        showVisitor.report();
// 汇总报表
        totalVisitor.totalSalary();
    }

    //模拟出公司的人员情况，我们可以想象这个数据室通过持久层传递过来的
    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
//产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
//产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
//再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
