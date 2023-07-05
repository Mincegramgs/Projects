package Loan;

public class PersonalLoan extends Loan { //BusinessLoan inherits the Loan parent class
	
	public PersonalLoan(String customerLastName, int num, double amount, double interestRate, int term ) {
		super(customerLastName, num, amount, term);
		this.interestRate = interestRate; //make sure that the rate is change depending on loan type
	}
}
