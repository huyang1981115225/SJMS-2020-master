package jiegouxing.day02proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 处理器接口
 *
 * @author HuYang
 * @date 2019-11-01 12:00
 */
public class StarHanler implements InvocationHandler {

    private Star realStar;

    public StarHanler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("核心方法执行前...");
        System.out.println("面谈、订机票");
        Object object = null;
        if ("sing".equals(method.getName())){
            object = method.invoke(realStar,args);
        }
        System.out.println("核心方法执行后...");
        System.out.println("收尾款");
        return object;
    }
}
