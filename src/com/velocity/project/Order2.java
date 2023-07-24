package com.velocity.project;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Order2 {
	   public static Scanner input = new Scanner(System.in);
	  
			public static String again;
			public static int choose,quantity=1;
			public static double total=0,pay;
		    public static int num1,kot;
			public static long bill;
			public static long d;
			public static String a,deliboy;
			public static void myrestorant() {
				System.out.println("--------------------------------------------");
				System.out.println("--------UPSOUTH HAAKAD----------------------");
				System.out.println("--------HK VENTURES-------------------------");
				System.out.println("--------BLISS SOCIETY,NEA DATTA HAND--------");
				System.out.println("--------WAKAd-THERGAON ROAD ,WAKAD----------");
				System.out.println("--------PCMc PUNE:-411057-------------------");
				System.out.println("--------------------------------------------");
			}
			    public static void type2() {
				System.out.println("---------------------------------------------");
				System.out.println("TYPE-Dine In ");
				System.out.println("---------------------------------------------");
				System.out.println("Enter a bill no=");
			    bill=input.nextLong();
			    System.out.println("Bill No="+bill);
			    
			    System.out.println("Delivery Boy Name=");
			    deliboy=input.next();
			    System.out.println(deliboy);
			    System.out.println("Enter a Kota type= ");
			    kot=input.nextInt();
			    System.out.println("Kota="+kot);
			    System.out.println("---------------------------------------------");
			}
			   public static void date() {
				Date date = new Date();
				
				System.out.println("Date:  "+date.toString());
				System.out.println("----------------------------------");
				
			}
			public static void customerdetails() {
				System.out.println("Enter Customer Name=");
				a=input.next();
				System.out.println("Customer Name:-"+a);
				System.out.println("Enter Customer Mobile Number=");
	     	    d=input.nextLong();
				System.out.println("Customer Mobile Number:-"+d);
				System.out.println("=-------------------------");
			}
			    public static void menu() {
				System.out.println("----------------------------");
				System.out.println("------UPSOUTH HAAKAD--------");
				System.out.println("----1.TEA------Rs.15--------");
				System.out.println("----2.COFFEE---Rs.25--------");
				System.out.println("----3.DOSA-----Rs.50--------");
				System.out.println("----4.CANCEL----------------");
				System.out.println("----------------------------");

			}
			public static void order() {
				System.out.println("press 1-TEA,press 2-COFFEE,press 3-DOSA.press 4-CANCEL");
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
						System.out.println("--------------------------");
						System.out.println("Payment Deatails");
						System.out.println("--------------------------");
						System.out.println("1.--------CASH PAYMENT----");
						System.out.println("2.--------CARD PAYMENT----");
						System.out.println("3.--------UPI PAYMENT-----");
						System.out.println("Select Mode of Payment");
						System.out.println("--------------------------");
					
						int mode=input.nextInt();
						switch(mode) {
						case 1:
						{
							System.out.println("1.CASH PAYMENT="+total);
							break;
						}
						case 2:
						{
							System.out.println("2.CARD PAYMENT="+total);
							break;
						}
						case 3:
						{
							System.out.println("3.UPI PAYMENT="+total);
							break;
						}
						default:
						{
							System.out.println("Please enter your current payment method"+total);
						}
						System.out.println("Payment="+total);
						System.out.println("--------------------------");
						}
						System.out.println("Your Amount is="+total);
						int cgst=10;
						System.out.println("CGST="+cgst);
						int sgst=5;
						System.out.println("SGST="+sgst);
						total=cgst+sgst+total;
							System.out.println("Total with cgst and sgst payment is "+total);
							System.out.println("Enter a Payment");
							pay=input.nextDouble();
							System.out.println("Payment="+pay);
							System.out.println("--------------------------");
						}
					if(pay<total) {
							System.out.println("Not Enough Payment");
					}else {
							System.out.println("Thank you for payment");
							System.out.println("--------------------------");
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
						System.out.println("--------------------------");
						System.out.println("Payment Deatails");
						System.out.println("--------------------------");
						System.out.println("1.--------CASH PAYMENT----");
						System.out.println("2.--------CARD PAYMENT----");
						System.out.println("3.--------UPI PAYMENT-----");
						System.out.println("Select Mode of Payment");
						System.out.println("--------------------------");
						int mode=input.nextInt();
						switch(mode) {
						case 1:
						{
							System.out.println("1.CASH PAYMENT="+total);
							break;
						}
						case 2:
						{
							System.out.println("2.CARD PAYMENT="+total);
							break;
						}
						case 3:
						{
							System.out.println("3.UPI PAYMENT="+total);
							break;
						}
						default:
						{
							System.out.println("Please enter your current payment method"+total);
						}
						System.out.println("Payment="+total);
						System.out.println("--------------------------");
						}
						System.out.println("Your Amount is="+total);
						int cgst=10;
						System.out.println("CGST="+cgst);
						int sgst=5;
						System.out.println("SGST="+sgst);
						total=cgst+sgst+total;
						System.out.println("total with cgst and sgst payment is "+total);
						System.out.println("Enter a payment");
						pay=input.nextDouble();
						System.out.println(" payment= "+pay);
						System.out.println("--------------------------");
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
						System.out.println("--------------------------");
						System.out.println("Payment Deatails");
						System.out.println("--------------------------");
						System.out.println("1.--------CASH PAYMENT----");
						System.out.println("2.--------CARD PAYMENT----");
						System.out.println("3.--------UPI PAYMENT-----");
						System.out.println("Select Mode of Payment");
						System.out.println("--------------------------");
						int mode=input.nextInt();
						switch(mode) {
						case 1:
						{
							System.out.println("1.CASH PAYMENT="+total);
							break;
						}
						case 2:
						{
							System.out.println("2.CARD PAYMENT="+total);
							break;
						}
						case 3:
						{
							System.out.println("3.UPI PAYMENT="+total);
							break;
						}
						default:
						{
							System.out.println("Please enter your current payment method"+total);
						}
						System.out.println("Payment="+total);
						System.out.println("--------------------------");
						}
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
						System.out.println("--------------------------");
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
			public static void gstno() {
				Random r =new Random();
				for(int i=0;i<1;i++) {
					num1=r.nextInt(999999999);
					System.out.println("--------------------------");
					System.out.println("GST NO="+num1);
					System.out.println("--------------------------");
				}
			}
			public static void main(String[] args){
				
				myrestorant();
				type2();
				date();
				customerdetails();
				menu();
				order();
				gstno();
		}
			

	}



	