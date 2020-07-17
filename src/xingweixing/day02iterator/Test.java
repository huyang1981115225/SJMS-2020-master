package xingweixing.day02iterator;

/**
 * @author HuYang
 * @date 2019-11-04 16:53
 */
public class Test {

    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");

        MyIterator iterator = cma.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
