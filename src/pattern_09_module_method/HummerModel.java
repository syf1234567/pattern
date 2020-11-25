package pattern_09_module_method;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * Hummer Model是悍马车辆模型的意思，不是悍马美女车模
 */
public abstract class HummerModel {
    /*
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
     * 是要能够发动起来，那这个实现要在实现类里了
     */
    protected abstract void start();

    //能发动，那还要能停下来，那才是真本事
    protected abstract void stop();

    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();

    //引擎会轰隆隆的响，不响那是假的
    protected abstract void engineBoom();

    //那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
    final public void run() {

        //先发动汽车
        this.start();

        //引擎开始轰鸣
        this.engineBoom();

        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        if(this.isAlarm()){
            this.alarm();
        }

        //到达目的地就停车
        this.stop();
    }

    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm(){
        return true;
    }


    /*这个叫做模板方法；start、stop、
    alarm、engineBoom 这四个方法是子类必须实现的，而且这四个方法的修改对应了不同的类，这个叫做基本
    方法，基本方法又分为三种：在抽象类中实现了的基本方法叫做具体方法；在抽象类中没有实现，在子类
    中实现了叫做抽象方法，我们这四个基本方法都是抽象方法，由子类来实现的；还有一种叫做钩子方法，
    这个等会讲。*/

    /*增加一个方法，isAlarm()，喇嘛要不要响，这就是钩子方法(Hook Method)，那我们只要修改一下抽
    象类就可以了：*/
}
