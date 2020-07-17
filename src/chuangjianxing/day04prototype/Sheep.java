package chuangjianxing.day04prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HuYang
 * @date 2019-10-31 20:02
 */
public class Sheep implements Cloneable,Serializable {
    private static final long serialVersionUID = 4641234766986452529L;

    private String name;

    private Date birthday;

    public Sheep(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // 直接调用object对象的clone()方法
        return super.clone();
    }

    public Sheep(String name, Date birthday) {
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
