package Area;

public class Rectangle {
	private double length, width;

	
	public Rectangle() {
	    length = 0.0;
		width = 0.0;
  }
	
	public Rectangle(double length, double width) { //use this keyword since we have the same names for parameter and method
		this.length = length;
		this.width = width;
  }
	
	public void setLength(double userL) {
		this.length = userL;
	}
	
	public void setWidth(double userW) {
		this.width = userW;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
		public double computeArea() { //method to calculate area of rectangle
		
		double area = length * width;
		return area; 
	}
}