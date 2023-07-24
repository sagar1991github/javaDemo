package com.velocity.project;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction2;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid)
	{
		customerName=cname;
		customerId=cid;
		
	}
	
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance + amount;
		    previousTransaction2 =-amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount!=0) {
			balance=balance-amount;
			previousTransaction2=-amount;
			
		}
	}
	void getpreviousTransaction() {
	
		if( previousTransaction2 > 0) {
			System.out.println("Deposited:"+ previousTransaction2);
		}
		else if(previousTransaction2<0) {
			System.out.println("Withdraw="+Math.abs(previousTransaction2));
		}
		else {
			System.out.println("No Transaction Assured!!!!!!!!");
		}
	}

	void showmenu() {
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome"+customerName);
		System.out.println("Your ID is "+customerId);
		System.out.println("\n");
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.previousTransaction2");
		System.out.println("E.Exit");
		
		do {
			System.out.println("----------------------------------------");
			System.out.println("Enter an Option");
			System.out.println("----------------------------------------");
				option=scanner.next().charAt(0);
				System.out.println("\n");
				
				switch(option)
				{
				case'A':
					System.out.println("-------------------------------------");
					System.out.println("Balance="+balance);
					System.out.println("-------------------------------------");
					System.out.println("\n");
				break;
				case'B':
					System.out.println("--------------------------------------");
					System.out.println("Enter to Deposit");
					System.out.println("---------------------------------------");
						int amount=scanner.nextInt();
                    deposit(amount);
                	System.out.println("\n");
                break;
                case'C':
                	System.out.println("---------------------------------------");
                	System.out.println("Enter a amount to Withdraw:-");
                	System.out.println("---------------------------------------");
                	amount=scanner.nextInt();
                	withdraw(amount);
                	System.out.println("\n");
                break;
                case'D':
                	System.out.println("----------------------------------------");
                	getpreviousTransaction();
                	System.out.println("-----------------------------------------");
                	System.out.println("\n");
                break;
                case'E':
                	System.out.println("------------------------------------------");
                break;
                default:
                		System.out.println("Invalid Option,Please Enter agaian");
                break;
				}
		
			
		} while (option !='E');
              	System.out.println("Thank you for using our services!!!!!!!!");
	
		
		
	}

	public static void main(String[] args) {
		BankAccount obj1=new BankAccount("xyz","00001");
		obj1.showmenu();

	}

}
