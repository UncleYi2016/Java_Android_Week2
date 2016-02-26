
public class Square extends Rectangle{
	private double size;
	
	Square(double x, double y, double size) {
		super(x, y, 0, 0);
		
		// TODO Auto-generated constructor stub
	}

	public double area(){
		return size;
	}
	public void resize(double newWidth, double newLength) throws CannotResizeException{
		if(newWidth != newLength){
			throw new CannotResizeException("Cannot resize a square into a rectangle!");
		}else{
			size = newWidth * newLength;
		}
	}
	
	public static void TestSquare(){
		Square sq = new Square(1.2, 2.4, 9);
		System.out.println(sq.area() == 9);
		try {
			sq.resize(2, 4);
		} catch (CannotResizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sq.resize(4, 4);
			System.out.println(sq.area() == 16);
		} catch (CannotResizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
