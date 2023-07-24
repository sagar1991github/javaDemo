package com.velocity.project;

public class Z implements A {
    
	
	public int addition(int a,int b) {
		int result =a+b;
			return result ;
	}
	public int substraction(int a,int b) {
		int result1 = a-b;
		return result1;
	}
	public int multiplication(int a,int b) {
		int result2 =a*b;
		return result2;
	}
	public int division(int a,int b) {
		int result3=a/b;
		return result3;
		
	}
	public int modulo(int a,int b) {
		int result4=a%b;
		return result4;
	}
	public int square(int c) {
		int result5=c*c;
		return result5;
	}
	public int cube(int d) {
		int result6=d*d*d;
		return result6;
	}
	public int average(int e,int f,int g,int h,int i) {
	    int add2=e+f+g+h+i;
	    float avg=add2/5;
	    System.out.println("Average of numbers="+avg);
		return add2;
	    
	    
	}
	public int factor(int j) {
		int fact=1;
		for(int k=1;k<=j;k++) {
			fact=fact*k;
		}
		System.out.println("Factorial of " +j+ "is" +fact);
		
		return j;
		
   }
	public int evenodd(int l) {
		if(l%2==0) {
			System.out.println(" The Number is Even ");
		}	
			else
			{
				System.out.println("The Number is odd");
				
		}
		return l;
	}
	@Override
	public void addition() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modulus() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void square() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cube() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void average() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void factor() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void evenodd() {
		// TODO Auto-generated method stub
		
	}
}
