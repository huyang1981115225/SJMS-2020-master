package chuangjianxing.day04prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HuYang
 * @date 2019-10-31 20:02
 */
public class Sheep2 implements Cloneable,Serializable {
    private static final long serialVersionUID = 4641234766986452529L;

    private String name;

    private Date birthday;

    public Sheep2(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {

        /**
         * 添加以下代码实现深克隆（deep clone）
         */
        Object obj = super.clone();
        Sheep2 sheep = (Sheep2) obj;

        // 需要克隆的引用类型属性
        sheep.birthday = (Date) this.birthday.clone();
        return obj;


    }

    public Sheep2(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
