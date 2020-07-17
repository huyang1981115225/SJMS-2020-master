package chuangjianxing.day04prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 *
 * @author HuYang
 * @date 2019-10-31 20:05
 */
public class Test01QianClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        String name = "多利羊";
        Date birthday = new Date(123456789L);
        Sheep sheep1 = new Sheep(name,birthday);
        System.out.println("sheep1:  "+sheep1);
        System.out.println("sheep1.name:  "+sheep1.getName());
        System.out.println("sheep1.birthday:  "+sheep1.getBirthday());

        System.out.println("------------------------------------------------");

        // 克隆一只羊
        Sheep sheep2 = (Sheep) sheep1.clone();
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
         * 基本类型是能够克隆的，但是引用类型仅仅是copy地址，
         * 并没有copy这个地址指向的值，这使得这两个地址指向同一个值，
         * 所以当浅克隆 birthday变了时，sheep2的birthday也发生了变化。
         * 注：String虽然是引用类型，但是这里能够克隆！！！
         */
        // 生日变了
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
