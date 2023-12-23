package atm_project;

import java.util.Scanner;

public class Main {
	
	public static void menu() {
	
		System.out.println("\n"+
				"1. View Available Balance."
				+ "\n2. Withdraw Amount."
				+ "\n3. Deposit Amount"
				+ "\n4. View Mini-Statement"
				+ "\n5.Exit");
	}

	public static void main(String[] args) {
		
		AtmOperation operation = new AtmOperation();
		
		int atmNumber = 12345;
		int atmPin = 123;
		System.out.println("**********Welcome to ATM Machine**********");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ATM Number: ");
		int atmNumByUser = sc.nextInt();
		System.out.println("Enter the ATM Pin: ");
		int atmPinByUser = sc.nextInt();
				
		if(atmNumber==atmNumByUser && atmPin == atmPinByUser) {
			System.out.println("___Validation Done Successfully___ \n");
			int flag=0;
			while(true) {
				menu();
				System.out.println("Please enter your choice: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("View Available Balance: ");
					operation.viewBalance();
					break;
				case 2:
					System.out.println("Withdraw Amount: ");
					operation.withdrawnAmount();
					break;
				case 3:
					System.out.println("Enter the Amount to be deposited: ");
					double depositAmount = sc.nextDouble();
					operation.depositAmount(depositAmount);
					break;
				case 4:
					System.out.println("View Mini-Statement: ");
					operation.miniStatement();
					break;
				case 5:
					System.out.println("Please collect your ATM Card. \nThanks for Banking with us!! ");
					flag=1;
					break;
				default:
					System.out.println("Please enter correct choice");
					break;
				}
				if(flag==1)
					break;
			}
			
		}
		else {
			System.out.println("Incorrect ATM Pin/Number !!!");
		}
		

	}

}
