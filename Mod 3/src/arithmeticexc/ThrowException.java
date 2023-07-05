package arithmeticexc;

import java.util.Scanner;

public class ThrowException {
	
	private static Scanner scan;
	public static void main(String[] args) {
	scan = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int a = scan.nextInt();
	System.out.print("Enter second number: ");
	int b = scan.nextInt(); 

	
	try {
		System.out.print(a/b);
	} catch(ArithmeticException ae) {
			System.out.println("Arithmetic exception was thrown.");
	} finally {
		System.out.println(" = " + a + "/" + b);
	}
		
	}
}
