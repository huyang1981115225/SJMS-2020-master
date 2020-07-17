package jiegouxing.day01adapter;

/**
 * 适配器（Adapter）相当于例子中的usb和ps/2转换器
 *
 * @author HuYang
 * @date 2019-11-01 11:22
 */
public class AdapterByClass extends Adaptee implements Target {

    /**
     * 适配器继承适配类，但是由于java单一继承，所以不方便
     */
    @Override
    public void handRequest() {
        super.request();
    }
}
