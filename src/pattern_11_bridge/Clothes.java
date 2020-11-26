package pattern_11_bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我集团公司生产的衣服
 */
public class Clothes extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的衣服是这个样子的...");
    }
    @Override
    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }

}
