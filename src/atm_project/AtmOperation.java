package atm_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmOperation {

	ATM atm = new ATM();
	Scanner sc = new Scanner(System.in);
	Map<Double,String> miniStatement = new HashMap<>();
	
	public void viewBalance() {
		System.out.println("Available Balance is: "+atm.getBalance()+"$");
	}
	
	public void withdrawnAmount() {
		System.out.println("Please enter the amount you want to withdraw: ");
		double withDrawnAmount = sc.nextDouble();
		
		if(withDrawnAmount%500==0) {
			if(withDrawnAmount<=atm.getBalance() && (withDrawnAmount%500==0)) {
				
				miniStatement.put(withDrawnAmount, "$ amount withdrawn");
				System.out.println("Please collect the cash!!!");
				atm.setBalance(atm.getBalance()-withDrawnAmount);
				viewBalance();
			}
			else {
				System.out.println("Not Enough Funds!! ");
				viewBalance();
			}
		}
		else {
			System.out.println("Please enter amount in multiple of 500.");
		}
	}
	
	public void depositAmount(double depositAmount) {
		
		miniStatement.put(depositAmount, "$ amount deposited");
		System.out.println(depositAmount + "$ Deposited Successfully!!");
		atm.setBalance(atm.getBalance()+depositAmount); 
		
		viewBalance();
	}
	
	public void miniStatement() {
		
		for(Map.Entry<Double,String> m: miniStatement.entrySet()) {
			System.out.println(m.getKey() + m.getValue());
		}
	}
}
