package pattern_06_abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 男性创建工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
}
