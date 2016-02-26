
public class Rectangle extends Shape{
	private double width;
	private double length;

	Rectangle(double x, double y, double width, double length) {
		super(x, y);
		this.width = width;
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return width * length / 2;
	}
	
	public void resize(double newSize) {
		width = newSize;
		length = newSize;
	}
	public void resize(double newWidth, double newLength) throws CannotResizeException {
		width = newWidth;
		length = newLength;
	}
	
	public static void TestRectangle(){
		Rectangle r = new Rectangle(1.2, 2.4, 3, 6);
		
		r.resize(4);
	}
}
