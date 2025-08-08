package ch06;

public class Ex_2 {

	public static void main(String[] args) {

	}

}

class Point {
	private int x, y;

	Point(int x, int y) {

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX() {
		this.x = x;
	}

	public void setY() {
		this.y = y;
	}

}

class MovablePoint extends Point {
	private int xSpeed, ySpeed; // Alt+Shift+s (getter, setter 자동완성)

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	MovablePoint(int x, int y, int xSpeed, int ySpped) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpped;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}