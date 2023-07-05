package classes;

public class PlaywithC {
	public static void main(String[] args) {
		
		Date birthday = new Date(12,25,2020);
		Date anniversary = new Date(1,2,2021);
		
		//birthday.month = 15;
		//birthday.day = 25;
		//birthday.year = 2020;
		birthday.setMonth(15);
		System.out.println(birthday);
		
		
	}
}