package pattern_14_iterator;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 老板来看项目信息了
 * 所以呀，这个迭代器模式也有点没落
 * 了，基本上很少有项目再独立写迭代器了，直接使用 List 或者 Map 就可以完整的解决问题。
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
 */
public class Boss {
    public static void main(String[] args) {
/*//定义一个List，存放所有的项目对象
        ArrayList<IProject> projectList = new ArrayList<IProject>();
//增加星球大战项目
        projectList.add(new Project("星球大战项目", 10, 100000));
//增加扭转时空项目
        projectList.add(new Project("扭转时空项目", 100, 10000000));
//增加超人改造项目
        projectList.add(new Project("超人改造项目", 10000, 1000000000));
//这边100个项目
        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 1000000));
        }
//遍历一下ArrayList，把所有的数据都取出
        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }*/
//定义一个List，存放所有的项目对象
        IProject project = new Project();
//增加星球大战项目
        project.add("星球大战项目ddddd",10,100000);
//增加扭转时空项目
        project.add("扭转时空项目",100,10000000);
//增加超人改造项目
        project.add("超人改造项目",10000,1000000000);
//这边100个项目
        for(int i=4;i<104;i++){
            project.add("第"+i+"个项目",i*5,i*1000000);
        }
        //遍历一下ArrayList，把所有的数据都取出
        IProjectIterator projectIterator = project.iterator();
        while(projectIterator.hasNext()){
            IProject p = (IProject)projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
