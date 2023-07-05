package Loan;

import java.util.Scanner;  //import utilities for user inputs 

public class CreateLoans {
    private static Scanner scan;

	public static void main(String[] args) {
        double totalL = 0;
        double businessTotal = 0, personalTotal = 0; //variables for calculating total including if the choose business or personal loan
        
    	scan = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        
        System.out.print("Enter the current prime interest rate: ");
        double primeInterest = scan.nextDouble();
        
        for(int i=0; i<5; i++){ //for loop to get user data for each loan variable
        	
        	int loanNumber = i+1;
            System.out.println("\nLoan number:" + loanNumber);
            
        	System.out.print("\nEnter the loan type (1 for Business Loan, 2 for Personal Loan): ");
            int loanType = scan.nextInt();
            
            System.out.print("\nEnter the customer last name: ");
            String customerLastName = scan.next();
            
            System.out.print("\nEnter the loan amount($): ");
            double loanAmount = scan.nextDouble();
            
            System.out.print("\nEnter term(yrs): ");
            int term = scan.nextInt();
            
            if(loanType == 1){
				double interestRate = primeInterest*.032;
				loans[i] = new BusinessLoan( customerLastName, loanNumber, loanAmount, interestRate, term);
				double sum = loans[i].loanAmount * loans[i].interestRate * loans[i].term/100 + loans[i].loanAmount;
				businessTotal += sum;
			}
            if(loanType == 2){
				double interestRate = primeInterest*.027;
				loans[i] = new PersonalLoan(customerLastName, loanNumber, loanAmount, interestRate, term);
				double sum = loans[i].loanAmount * loans[i].interestRate * loans[i].term/100 + loans[i].loanAmount;
				personalTotal += sum;
			}
		}
		for(int i=0;i<5;i++){
			System.out.println(loans[i].toString());
			double sum = loans[i].loanAmount * loans[i].interestRate * loans[i].term/100 + loans[i].loanAmount;
			totalL += sum;
			System.out.println("Amount to be payed at due date: "+ sum  + "$");
		}
		System.out.println("\nTotal in Business Loans: "+ businessTotal + "$");
		System.out.println("\nTotal in Personal Loans: "+ personalTotal + "$");
		System.out.println("\nTotal amount: "+ totalL + "$" );
    }
		
}