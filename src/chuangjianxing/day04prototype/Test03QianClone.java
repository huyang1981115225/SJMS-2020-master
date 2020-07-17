package chuangjianxing.day04prototype;

import java.util.Date;

/**
 * @author HuYang
 * @date 2019-11-01 11:02
 */
public class Test03QianClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        int age = 1;
        String name = "多利羊";
        int [] account = new int[]{100};
        Sheep3 sheep1 = new Sheep3(age,name,account);

        System.out.println("sheep1:  "+sheep1);
        System.out.println("sheep1.age:  "+sheep1.getAge());
        System.out.println("sheep1.name:  "+sheep1.getName());
        System.out.println("sheep1.account:  "+sheep1.getAccount()[0]);

        System.out.println("------------------------------------------------");

        // 克隆一只羊
        Sheep3 sheep2 = (Sheep3) sheep1.clone();
        System.out.println("sheep2.age:  "+sheep2.getAge());
        System.out.println("sheep2.name:  "+sheep2.getName());
        System.out.println("sheep2.account:  "+sheep2.getAccount()[0]);

        System.out.println("------------------------------------------------");

        age = 2;
        name = "我变了";
        account[0] = 200;
        // 年龄没变
        System.out.println("变了后的sheep1.age:  "+sheep1.getAge());

        // 名字没变
        System.out.println("变了后的sheep1.name:  "+sheep1.getName());

        // 数量变了
        System.out.println("变了后的sheep1.account:  "+sheep1.getAccount()[0]);

        // 年龄没变
        System.out.println("变了后的sheep2.age:  "+sheep2.getAge());

        // 名字没变
        System.out.println("变了后的sheep2.name:  "+sheep2.getName());

        // 数量变了
        System.out.println("变了后的sheep2.account:  "+sheep2.getAccount()[0]);

        System.out.println("------------------------------------------------");

        // 当克隆出的新对象发生改变时
        sheep2.setAge(111);
        sheep2.setName("sheep2变了");
        sheep2.setAccount(new int[]{500});

        /**
         * 克隆出来的新对象的改变不会影响原型对象
         */
        // 年龄没变
        System.out.println("sheep2变了后的sheep1.age:  "+sheep1.getAge());

        // 名字没变
        System.out.println("sheep2变了后的sheep1.name:  "+sheep1.getName());

        // 数量没变
        System.out.println("sheep2变了后的sheep1.account:  "+sheep1.getAccount()[0]);

        // 年龄变了
        System.out.println("sheep2变了后的sheep2.age:  "+sheep2.getAge());

        // 名字变了
        System.out.println("sheep2变了后的sheep2.name:  "+sheep2.getName());

        // 数量变了
        System.out.println("sheep2变了后的sheep2.account:  "+sheep2.getAccount()[0]);
    }
}
