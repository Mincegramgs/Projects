package Area;
public class Area{
	
 
	public static void  main(String[] args) {
	Rectangle r1 = new Rectangle(4.0,5.0);
	Rectangle r2 = new Rectangle(5.7,8.1);
	
	Circle c1 = new Circle(4.2);
	Circle c2 = new Circle(3.0);
			
	System.out.println("Rectangle with sides " + r1.getLength() + " and " + r1.getWidth() + " has an area of " + r1.computeArea());
	System.out.println("Rectangle with sides " + r2.getLength() + " and " + r2.getWidth() + " has an area of " + r2.computeArea());
	System.out.println("Circle with radius " + c1.getRadius() +  " has an area of " + c1.computeArea());
	System.out.println("Rectangle with radius " + c2.getRadius() + " has an area of " + c2.computeArea());
	
	}
}