package chuangjianxing.day03builder;

/**
 * 建造者模式：
 *
 * 优势：解耦对象的创建和应用，通过创建者创建复杂的产品对象，
 *      尤其是基于配置创建对象的场景会大量使用创建者模式。
 *
 * 劣势：要创建的对象结构加入频繁变化，可能导致构建对象的设计比较复杂。
 *
 * @author HuYang
 * @date 2019-10-31 19:29
 */
public class Test {

    public static void main(String[] args) {

        // 构建
        ShenZhouAirShipBuilder builder = new ShenZhouAirShipBuilder();

        // 装配
        ShenZhouAirShipDirector director = new ShenZhouAirShipDirector(builder);

        AirShip airShip = director.directAirShip();

        airShip.lunch();

    }
}
