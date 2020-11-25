package pattern_10_builder;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 各种设施都给了，我们按照一定的顺序制造一个奔驰车
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
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
