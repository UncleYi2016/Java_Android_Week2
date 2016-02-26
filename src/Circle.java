
public class Circle extends Shape{
	private double radius;
	
	Circle(double x, double y, double radius){
		super(x, y);
		this.radius = radius;
	}
	
	public double area(){
		return Math.PI * radius * radius;
	}
	
	public void resize(double newRadius){
		radius = newRadius;
	}
	
	public static void TestCircle(){
		Circle c = new Circle(1.2, 2.4, 3);
		
		System.out.println(c.getX() == 1.2);
		System.out.println(c.getY() == 2.4);
		System.out.println(c.area() == Math.PI * 3 * 3);
		c.move(2.4, 4.8);
		c.resize(2);
		
		System.out.println(c.getX() == 2.4);
		System.out.println(c.getY() == 4.8);
		System.out.println(c.area() == Math.PI * 2 * 2);
	}
}
