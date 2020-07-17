package xingweixing.day02iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 *
 * @author HuYang
 * @date 2019-11-04 16:41
 */
public class ConcreteMyAggregate {

    private List<Object> list = new ArrayList<>();

    public void addObject(Object object) {
        this.list.add(object);
    }

    public void removeObject(Object object) {
        this.list.remove(object);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    /**
     * 获取迭代器
     */
    public MyIterator createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator {

        // 定义游标用于记录遍历时的位置
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0 ? true : false;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size() - 1) ? true : false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
