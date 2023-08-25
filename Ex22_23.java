package ex7;

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape {
	double r;

	public Circle() {
	}

	public Circle(double r) {
		this.r = r;
	}

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	int width;
	int height;

	public Rectangle() {}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	public boolean isSquare() {
		return width == height;
	}

	@Override
	double calcArea() {
		return width * height;
	}
}

public class Ex22_23 {
	public static double sumArea(Shape[] shapes) {
		double sum = 0;
		for(int i=0; i<shapes.length; i++) {
			sum += shapes[i].calcArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));
	}
}