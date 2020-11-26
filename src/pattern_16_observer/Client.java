package pattern_16_observer;

import java.util.Observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 这个Client就是我们，用我们的视角看待这段历史
 * 1.策略模式
 * 2.代理模式
 * 3.单例模式
 * 4.多例模式
 * 5.工厂方法模式
 * 6.抽象工厂模式
 * 7.门面模式
 * 8.适配器模式
 * 9.模板方法模式
 * 10.建筑者模式
 * 11.桥梁模式
 * 12.命令模式
 * 13.装饰模式
 * 14.迭代器模式
 * 15.组合模式
 * 16.观察者模式
 * 17.责任链模式
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
/*//定义出韩非子和李斯
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
//观察早餐
        Watch watchBreakfast = new Watch(hanFeiZi, liSi, "breakfast");
//开始启动线程，监控
        watchBreakfast.start();
//观察娱乐情况
        Watch watchFun = new Watch(hanFeiZi, liSi, "fun");
        watchFun.start();
        //然后这里我们看看韩非子在干什么
        Thread.sleep(1000); //主线程等待1秒后后再往下执行
        hanFeiZi.haveBreakfast();
//韩非子娱乐了
        Thread.sleep(1000);
        hanFeiZi.haveFun();*/
//定义出韩非子
/*        HanFeiZi hanFeiZi = new HanFeiZi();
//然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
//韩非子娱乐了
        hanFeiZi.haveFun();*/
//三个观察者产生出来
/*        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
//定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
//我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
//然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();*/
//三个观察者产生出来
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
//定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
//我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
//然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
    }
}
