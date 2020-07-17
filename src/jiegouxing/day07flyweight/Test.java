package jiegouxing.day07flyweight;

public class Test {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(ChessFlyWeightFactory.getMap());
		
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(ChessFlyWeightFactory.getMap());
		
		ChessFlyWeight chess3 = ChessFlyWeightFactory.getChess("白色");
		System.out.println(ChessFlyWeightFactory.getMap());
		
		System.out.println(chess1);
		System.out.println(chess2);
		System.out.println(chess1 == chess2);
		
		System.out.println("增加外部状态的处理...");
		chess1.display(new Coordinate(10,10));
		chess2.display(new Coordinate(20,20));
	}
}
