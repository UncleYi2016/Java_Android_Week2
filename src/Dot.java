
public class Dot extends Shape{

	Dot(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public double area(){
		return 0;
	}
	public void resize(double newSize) throws Exception{
		throw new Exception("Cannot change an dot's size");
	}
	
	public static void TestDot(){
		Dot d = new Dot(1.2, 2.4);
		
		System.out.println(d.getX() == 1.2);
		System.out.println(d.getY() == 2.4);
		d.move(2.4, 4.8);
		System.out.println(d.getX() == 2.4);
		System.out.println(d.getY() == 4.8);
		System.out.println(d.area() == 0);
	}
	
}
