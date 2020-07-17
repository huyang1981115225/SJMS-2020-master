package jiegouxing.day04composite;

/**
 * 抽象构件角色
 *
 * @author HuYang
 * @date 2019-11-01 14:38
 */
public interface Component {

    /**
     * 某些操作
     */
    void operation();
}

/**
 * 叶子构件角色
 */
class Leaf implements Component{

    @Override
    public void operation() {

    }
}

/**
 * 容器构件角色：可以定义增删改查的方法
 */
interface Composite extends Component{

    void add(Component component);

    void remove(Component component);

    Component getChild(int index);
}
