package Rectangle;

public class MainProgRectangle {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5.0, 10.0);
		System.out.println(
							"Area: " + rect1.getArea() + "m\n"
							+ "Perimeter: " + rect1.getPerimeter() + "m\n");
	}
}
