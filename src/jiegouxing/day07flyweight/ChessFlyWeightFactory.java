package jiegouxing.day07flyweight;
/**
 * 享元工厂类
 */
import java.util.HashMap;
import java.util.Map;


public class ChessFlyWeightFactory {
	private static Map<String, ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color){
		if (map.get(color) != null) {
			return map.get(color);
		}else {
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}

	public static Map<String, ChessFlyWeight> getMap() {
		return map;
	}

	public static void setMap(Map<String, ChessFlyWeight> map) {
		ChessFlyWeightFactory.map = map;
	}
}
