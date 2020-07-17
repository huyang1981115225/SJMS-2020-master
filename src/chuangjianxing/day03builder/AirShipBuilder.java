package chuangjianxing.day03builder;

/**
 * 抽象建造者（builder）：
 * 包含创建产品的各个子部件的抽象方法的接口，通常还包括一个返回复杂产品的方法
 *
 * @author HuYang
 * @date 2019-10-31 15:49
 */
public interface AirShipBuilder {

    /**
     * 构建轨道舱
     * @return
     */
    OrbitalMoudle builderOrbitalMoudle();

    /**
     * 构建发动机
     * @return
     */
    Engine builderEngine();

    /**
     * 构建逃逸塔
     * @return
     */
    EscapeTower builderEscapeTower();
}
