package pattern_11_bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 房地产公司，按照翻译来说应该叫realty corp，这个是比较准确的翻译
 * 但是我问你房地产公司翻译成英文，你第一反应什么？对嘛还是house corp!
 */
public class HouseCorp extends Corp {

    //定义传递一个House产品进来
    public HouseCorp(House house) {
        super(house);
    }

    //房地产公司很High了，赚钱，计算利润
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
    /*//房地产公司就是盖房子
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子...");
    }

    //房地产卖房子，自己住那可不赚钱
    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子...");
    }
    //房地产公司很High了，赚钱，计算利润
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }*/
}
