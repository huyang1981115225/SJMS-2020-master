package jiegouxing.day01adapter;

/**
 * @author HuYang
 * @date 2019-11-01 11:29
 */
public class Test02 {

    public static void main(String[] args) {

        Test02 test = new Test02();
        Adaptee adaptee = new Adaptee();
        Target target = new AdapterByInterface(adaptee);
        test.show(target);
    }

    public void show(Target target){
        target.handRequest();
    }
}
