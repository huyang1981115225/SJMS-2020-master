package jiegouxing.day01adapter;

/**
 * @author HuYang
 * @date 2019-11-01 11:28
 */
public class Test01 {

    public static void main(String[] args) {

        Test01 test = new Test01();
        Target target = new AdapterByClass();
        test.show(target);
    }

    public void show(Target target){
        target.handRequest();
    }
}
