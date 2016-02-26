
public class Shape {
	private double x;
	private double y;
	
	Shape(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public void move(double dx, double dy){
		x = dx;
		y = dy;
	}
	public double area(){
		return 0;
	}
	public void resize(double newSize){
		
	}
	
	public static void TestShape(){
		Shape s = new Shape(1.2, 2.4);
		
		System.out.println(s.getX() == 1.2);
		System.out.println(s.getY() == 2.4);
		s.move(2.4, 4.8);
		System.out.println(s.getX() == 2.4);
		System.out.println(s.getY() == 4.8);
	}
}
