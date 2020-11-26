package pattern_11_bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我要关心我自己的公司了
 * 你都是在扩展，唯一你要修改的就是 Client 类，你类都增加了哪能不修改调用呢,
 * 也就是说 Corp 类和
 * Product 类都可以自由的扩展，而不会对整个应用产生太的变更，这就是桥梁模式。
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
 *
 */
public class Client {
    public static void main(String[] args) {
      /*  System.out.println("-------房地产公司是这个样子运行的-------");
//先找到我的公司
        //HouseCorp houseCorp = new HouseCorp();
//看我怎么挣钱
       // houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-------服装公司是这样运行的-------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();

        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();*/
        House house = new House();
        System.out.println("-------房地产公司是这个样子运行的-------");
//先找到我的公司
        HouseCorp houseCorp = new HouseCorp(house);
//看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
//山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}
