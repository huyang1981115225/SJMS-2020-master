package jiegouxing.day01adapter;

/**
 * 适配器（Adapter）相当于例子中的usb和ps/2转换器
 *
 * @author HuYang
 * @date 2019-11-01 11:25
 */
public class AdapterByInterface implements Target {

    private Adaptee adaptee;

    /**
     * 将适配器当参数传入
     *
     * @param adaptee
     */
    public AdapterByInterface(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 由适配器自己调用适配类
     */
    @Override
    public void handRequest() {
        adaptee.request();
    }
}
