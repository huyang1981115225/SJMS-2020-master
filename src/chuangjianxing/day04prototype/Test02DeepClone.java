package chuangjianxing.day04prototype;

import java.util.Date;

/**
 * 测试原型模式（深克隆）
 *
 * @author HuYang
 * @date 2019-11-01 10:49
 */
public class Test02DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        String name = "多利羊";
        Date birthday = new Date(123456789L);
        Sheep2 sheep1 = new Sheep2(name,birthday);
        System.out.println("sheep1:  "+sheep1);
        System.out.println("sheep1.name:  "+sheep1.getName());
        System.out.println("sheep1.birthday:  "+sheep1.getBirthday());

        System.out.println("------------------------------------------------");

        // 克隆一只羊
        Sheep2 sheep2 = (Sheep2) sheep1.clone();
        System.out.println("sheep2:  "+sheep2);
        System.out.println("sheep2.name:  "+sheep2.getName());
        System.out.println("sheep2.birthday:  "+sheep2.getBirthday());

        System.out.println("------------------------------------------------");

        name = "我变了";
        birthday.setTime(6666666666666L);
        // 名字没变
        System.out.println("变了后的sheep1.name:  "+sheep1.getName());

        // 生日变了
        System.out.println("变了后的sheep1.birthday:  "+sheep1.getBirthday());

        // 名字没变
        System.out.println("变了后的sheep2.name:  "+sheep2.getName());

        /**
         * 深克隆，引用类型也克隆了
         */
        // 生日没变
        System.out.println("变了后的sheep2.birthday:  "+sheep2.getBirthday());

        System.out.println("------------------------------------------------");

        // 当克隆出的新对象发生改变时
        sheep2.setName("sheep2变了");
        sheep2.setBirthday(new Date(8888888888888L));

        /**
         * 克隆出来的新对象的改变不会影响原型对象
         */
        // 名字没变
        System.out.println("sheep2变了后的sheep1.name:  "+sheep1.getName());

        // 生日没变
        System.out.println("sheep2变了后的sheep1.birthday:  "+sheep1.getBirthday());

        // 名字变了
        System.out.println("sheep2变了后的sheep2.name:  "+sheep2.getName());

        // 生日变了
        System.out.println("sheep2变了后的sheep2.birthday:  "+sheep2.getBirthday());
    }
}
