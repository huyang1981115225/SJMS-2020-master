package chuangjianxing.day03builder;

/**
 * 建造者模式：
 * 一个复杂的产品对象（Airship） 包含 很多 零部件
 * @author HuYang
 * @date 2019-10-31 15:45
 */
public class AirShip {

    // 轨道舱
    private OrbitalMoudle orbitalMoudle;

    // 发动机
    private Engine engine;

    // 逃逸塔
    private EscapeTower escapeTower;

    public void lunch(){
        System.out.println("神州十号发射！！！");
    }

    public OrbitalMoudle getOrbitalMoudle() {
        return orbitalMoudle;
    }

    public void setOrbitalMoudle(OrbitalMoudle orbitalMoudle) {
        this.orbitalMoudle = orbitalMoudle;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}

/**
 * 轨道舱
 */
class OrbitalMoudle{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 发动机
 */
class Engine{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 逃逸塔
 */
class EscapeTower{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
