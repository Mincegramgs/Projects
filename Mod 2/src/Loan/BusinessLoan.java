package Loan;

public class BusinessLoan extends Loan { //BusinessLoan inherits the Loan parent class
	
	public BusinessLoan(String customerLastName,  int loanNumber, double loanAmount, double interestRate, int term  ) {
		super(customerLastName, loanNumber, loanAmount, term);
		this.interestRate = interestRate; 
		
	}
	
}
