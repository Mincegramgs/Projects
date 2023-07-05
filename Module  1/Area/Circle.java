package Area;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 0.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public void setRadius(double userR) {
		this.radius = userR;
}
	public double getRadius() {
		return radius;
	}
	public double computeArea() {
		
		double area = radius * radius* 3.14159;
		return area; 
	}
}