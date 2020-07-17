package chuangjianxing.day03builder;

/**
 * 装配者（指挥者）：
 * 调用建造者对象中的部件构造与装配方法来完成复杂对象的创建，在指挥者中不涉及具体产品的信息
 *
 * @author HuYang
 * @date 2019-10-31 17:32
 */
public class ShenZhouAirShipDirector {

    private AirShipBuilder builder;

    /**
     * 构建者当做参数传给装配者
     *
     * @param builder
     */
    public ShenZhouAirShipDirector(AirShipBuilder builder){
        super();
        this.builder = builder;
    }

    /**
     * 由装配者装配
     *
     * @return
     */
    public AirShip directAirShip(){

        /**
         * 先由构建者构建
         */
        //构轨道舱
        OrbitalMoudle orbitalMoudle = builder.builderOrbitalMoudle();
        orbitalMoudle.setName("神州十号轨道舱");

        // 构建发动机
        Engine engine = builder.builderEngine();
        engine.setName("神州十号发动机");

        // 构建逃逸塔
        EscapeTower escapeTower = builder.builderEscapeTower();
        escapeTower.setName("神舟十号逃逸塔");

        /**
         * 再由装配者装配
         */
        AirShip airShip = new AirShip();
        airShip.setOrbitalMoudle(orbitalMoudle);
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);

        return airShip;
    }
}
