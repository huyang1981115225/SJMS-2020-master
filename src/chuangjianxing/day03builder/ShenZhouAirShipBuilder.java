package chuangjianxing.day03builder;

/**
 * 具体建造者：
 * 实现builder 接口，完成复杂产品的各个零部件的具体创建方法
 *
 * @author HuYang
 * @date 2019-10-31 16:02
 */
public class ShenZhouAirShipBuilder implements AirShipBuilder {

    @Override
    public OrbitalMoudle builderOrbitalMoudle() {
        System.out.println("构建神州飞船轨道舱...");
        return new OrbitalMoudle();
    }

    @Override
    public Engine builderEngine() {
        System.out.println("构建神州飞船发动机...");
        return new Engine();
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建神州飞船逃逸塔...");
        return new EscapeTower();
    }
}
