package pattern_20_protobyte;

import java.util.ArrayList;

public class Thing implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();


    @Override
    public Thing clone() {
        Thing thing = null;
        this.arrayList = (ArrayList<String>) this.arrayList.clone();
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
