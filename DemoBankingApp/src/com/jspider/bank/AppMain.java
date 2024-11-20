package com.jspider.bank;
import java.util.Scanner;
import com.jspider.bank.business.UserBusiness;
import com.jspider.bank.business.UserBusinessImplementation;

public class AppMain {
	public static void main(String[] args) {
		UserBusiness userBusiness = new UserBusinessImplementation();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("Enter 1 to create an account");
			System.out.println("Enter 2 to login");
			System.out.println("Enter 3 to exit");
			System.out.println("Enter your Choice: ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: 
				
				userBusiness.createAccount();
				break;
			
			case 2:
				userBusiness.logIn();
				break;
				
			case 3:
				run = false;
				System.out.println("Thank you");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}
		scanner.close();
	}

}
