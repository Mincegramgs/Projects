


public class Index { 
	
	public static void main(String[] args) {
		//Part1
		Integer[] iArray= {2,4,6,8};
		int value1 = 6;
		// calls and prints index position for different types
		System.out.println("The index of value of "+ value1 +" is at "+ List.findIn(iArray,value1));

		String[] iArray2= {"vanilla", "chocolate","strawberry","cookies and cream","peanut butter"};
		String value2 = "chocolate";
		
		System.out.println("The index of value of "+ value2 +" is at "+ List.findIn(iArray2,value2));
		
		Double[] iArray3 = {1.4, 2.4,5.3, 6.9};
		Double value3 = 2.4;
		
		System.out.println("The index of value of "+ value3 +" is at "+ List.findIn(iArray3,value1));
		
		//Part2
		GreaterThan2 item1 = new GreaterThan2(26);
		GreaterThan2 item2 = new GreaterThan2(2);
		
		GreaterThan2 result = GreaterThan.greaterThan(item1, item2);
        System.out.println("The greater value between 26 and 2 is " + result.getValue());

	}

	
}

	