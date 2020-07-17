package xingweixing.day02iterator;

/**
 * 自定义的迭代器接口
 *
 * @author HuYang
 * @date 2019-11-04 16:37
 */
public interface MyIterator {

    /**
     * 将游标指向第一个元素
     */
    void first();

    /**
     * 将游标指向下一个元素
     */
    void next();

    /**
     * 判断是否存在下一个元素
     */
    boolean hasNext();

    /**
     * 判断该元素是否是第一个
     */
    boolean isFirst();

    /**
     * 判断该元素是最后一个
     */
    boolean isLast();

    /**
     * 返回当前游标的指向对象
     */
    Object getCurrentObj();
}
