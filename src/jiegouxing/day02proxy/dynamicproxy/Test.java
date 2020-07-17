package jiegouxing.day02proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author HuYang
 * @date 2019-11-01 12:07
 */
public class Test {

    public static void main(String[] args) {

        Star realStar = new RealStar();
        StarHanler hanler = new StarHanler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},hanler);

        proxy.sing();

    }
}
