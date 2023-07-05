package Loan;

public abstract class Loan implements LoanConstants { //abstract loan class implements loan constants
	protected int loanNumber; 
	protected String customerLastName;
	protected double loanAmount;
	protected double interestRate;
	protected int term;
	
	public Loan(String customerLastName, int loanNumber, double loanAmount,  int term) {
		super();
		this.loanNumber = loanNumber;
		this.customerLastName = customerLastName;
		 if (loanAmount > MAX) {
	            this.loanAmount = MAX;
	        } else {
	            this.loanAmount = loanAmount;
	        }

	        if (term == 3 || term == 7 || term == 15) {
	            this.term = term;
	        } else {
	            this.term = 3; //force to short term
	        }
	}
	
	public double calculateTotalAmount() {
        return loanAmount + (loanAmount * interestRate);
    }

	@Override
	public String toString(){
		String result;
		result = "Customer last name: " + customerLastName + "\nLoan number: " + loanNumber + "\nLoan amount: " + loanAmount + "$" + "\nInterest Rate: "+ (interestRate*100) + "%" + "\nTerm: " + term + " years" + "\nTotal amount: " + calculateTotalAmount() + "$";
		return result;
		
	}
	public boolean equals(Loan loan) {
		boolean result = false;
		if( this.customerLastName.equals(loan.customerLastName) && this.loanNumber == loan.loanNumber && this.loanAmount == loan.loanAmount && this.term == loan.term) {
			result = true;
		}
		return result;
	}

	
}
