package com.velocity.project;
import java.util.Date;
import java.util.Scanner;

public class Ordersystem {
        
	    public static Scanner input = new Scanner(System.in);
		public static String again;
		public static int choose,quantity=1;
		public static double total=0,pay;
		
		
		
		public static void myrestorant() {
			
			System.out.println("\t\t\t\t--------UPSOUTH HAAKAD--------");
			System.out.println("\t\t\t\t--------HK VENTURES------------");
			System.out.println("\t\t\t\t--------BLISS SOCIETY,NEA DATTA HAND--------");
			System.out.println("\t\t\t\t--------WAKAd-THERGAON ROAD ,WAKAD----------");
			System.out.println("\t\t\t\t--------PCMc PUNE:-411057------");
			System.out.println("\t\t\t\t--------------------------------");
		}
		public static void date() {
			Date date = new Date();
			
			System.out.println("Date:  "+date.toString());
			System.out.println("----------------------------------");
			
		}
		public static void customerdetails() {
			System.out.println("Enter Customer Name");
			String a=input.nextLine();
			System.out.println("Customer Name:-"+a);
			System.out.println("Enter Customer Mobile Number");
     		long d=input.nextLong();
			System.out.println("Customer Mobile Number:-"+d);
		}
		
		public static void menu() {
			System.out.println("----------------------------");
			System.out.println("------PATIL RESTARAUNT------");
			System.out.println("----1.TEA------Rs.15--------");
			System.out.println("----2.COFFEE---Rs.25--------");
			System.out.println("----3.DOSA-----Rs.50--------");
			System.out.println("----4.CANCEL----------------");

		}
		public static void order() {
			System.out.println("press 1 to order TEA,press 2 to order COFFEE,press 3 to order DOSA.press 4 to CANCEL");
			System.out.println("What you want to buy ?");
			choose=input.nextInt();
			if (choose==1) {
				System.out.println("you choose TEA");
				System.out.println("How many TEA you want to buy?");
				quantity=input.nextInt();
				total=total+(quantity*15);
				System.out.println(+total);
				System.out.println("you want to buy again");
				System.out.println("press Y for yes and N for no:");
				
				again=input.next();
				if (again.equalsIgnoreCase("y")) {
					menu();
					order();
				}else {
					System.out.println("Your Amount is"+total);
					int cgst=10;
					System.out.println("CGST="+cgst);
					int sgst=5;
					System.out.println("SGST="+sgst);
					total=cgst+sgst+total;
						System.out.println("Total with cgst and sgst payment is "+total);
						System.out.println("Enter a Payment");
						pay=input.nextDouble();
						System.out.println("Payment="+pay);
					}
				if(pay<total) {
						System.out.println("Not Enough Payment");
				}else {
						System.out.println("Thank you for payment");
					}
				}
			else if (choose==2) {
				System.out.println("you choose COFFEE");
				System.out.println("How many COFFEE you want to buy?");
				quantity=input.nextInt();
				total=total+(quantity*25);
				System.out.println(+total);
				System.out.println("you want to buy again");
				System.out.println("press Y for yes and N for no:");
				again=input.next();
				if (again.equalsIgnoreCase("y")) {
					menu();
					order();
				}else {
					System.out.println("Your Amount is"+total);
					int cgst=10;
					System.out.println("CGST="+cgst);
					int sgst=5;
					System.out.println("SGST="+sgst);
					total=cgst+sgst+total;
					System.out.println("total with cgst and sgst payment is "+total);
					System.out.println("Enter a payment");
					pay=input.nextDouble();
					System.out.println(" payment= "+pay);
					if(pay<total) {
						System.out.println("Not enough Payment");
					}else {
						System.out.println("Thank You for Payment");
					}
				}
			}else if (choose==3) {
				System.out.println("you choose DOSA");
				System.out.println("How many DOSA you want to buy?");
				quantity=input.nextInt();
				total=total+(quantity*50);
				System.out.println(+total);
				System.out.println("you want to buy again");
				System.out.println("press Y for yes and N for no:");
				again=input.next();
				if (again.equalsIgnoreCase("y")) {
					menu();
					order();
				}else {
					System.out.println("your Amount is="+total);
						int cgst=10;
						System.out.println(" CGST= "+cgst);
						int sgst=5;
						System.out.println(" SGST= "+sgst);
						total=cgst+sgst+total;
						System.out.println("total with cgst and sgst payment is "+total);
					System.out.println("Enter a Payment");
					pay=input.nextDouble();
					System.out.println("payment= "+pay);
				}
				if(pay<total) {
					System.out.println("Not Enough Payment");
				}
				else {
					System.out.println("Thank you for Payment");
				}
		      }
		
			 else if (choose==4) {
				System.exit(0);//close programm
			}
			 else {
				System.out.println("Choose 1 to 4 only");
				order();
			}
	
		}		
		public static void main(String[] args){
			
			myrestorant();
			date();
			customerdetails();
			menu();
			order();
	}
		

}

