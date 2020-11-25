package pattern_09_module_method;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * H1和H2有什么差别，还真不知道，真没接触过悍马
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    /*
     * H2要跑，那肯定要启动，停止了等，也就是要调其他方法
     *//*
    @Override
    public void run() {

        //先发动汽车
        this.start();

        //引擎开始轰鸣
        this.engineBoom();

        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.alarm();

        //到达目的地就停车
        this.stop();
    }*/
    //默认没有喇叭的
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
