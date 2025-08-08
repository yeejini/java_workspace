package ch06;

public class BoxDemo {

	public static void main(String[] args) {
		ColoredBox cd = new ColoredBox("빨간색");
	}

}

class Box {
	public Box() {
		super();
		System.out.println("box가 생성되었습니다.");
	}
}

class ColoredBox extends Box {
	String color;

	public ColoredBox() {
		System.out.println("ColoredBox가 생성되었습니다.");
	}

	public ColoredBox(String color) {
		this.color = color;
		System.out.println(color + " ColoredBox 가 생성");
	}
}