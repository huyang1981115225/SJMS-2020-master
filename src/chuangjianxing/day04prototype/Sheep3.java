package chuangjianxing.day04prototype;

/**
 * 由此可见：浅克隆仅仅适合克隆基本类型，对于引用类型就不能实现克隆了
 * 注：String类型克隆时同基本类型！！！
 *
 * @author HuYang
 * @date 2019-11-01 10:57
 */
public class Sheep3 implements Cloneable {

    // 基本类型
    private int age;

    // 非基本类型，但是String比较特殊！！！
    private String name;

    // 非基本类型
    private int[] account;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Sheep3(){}

    public Sheep3(int age, String name, int[] account) {
        this.age = age;
        this.name = name;
        this.account = account;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getAccount() {
        return account;
    }

    public void setAccount(int[] account) {
        this.account = account;
    }
}
