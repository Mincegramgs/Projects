package classes;

public class Date { // is a thing
	private int month; //instance variables are the relationship for the thing
	private int day;
	private int year;// private means only accessed in the class

	public Date(int m, int d, int y) { // constructor method allows to declare values
		month = m;
		year = y;
		day = d;
	}

	public int getMonth() { //accesor method or getters
		return month;
	}
	public int getyear() { //accesor method or getters
		return year;
	}
	public int getday() { //accesor method or getters
		return day;
	}
	public void setMonth(int m) { //mutators(setters) method have void data type
		if( m>= 1 && m<= 12) {
		month = m;
		}
	}
	public void setyear(int y) {
		year = y;
	}
	public void setday(int d) {
		if( d>= 1 && d<= 31) {
		day = d;
		}
	}
	public String toString() {
		String result;
		result = month + "/" + day + "/" + year;
		return result;
	}
}