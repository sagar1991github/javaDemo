package com.velocity.project;

public class TestMain {

	public static void main(String[] args) {
		Z z =new Z();
		int x=z.addition(10, 20);
		System.out.println(x);

		int y=z.substraction(20, 10);
		System.out.println(y);
		
		int u=z.multiplication(10, 10);
		System.out.println(u);
		
		int m=z.division(10, 5);
		System.out.println(m);
		
		int n=z.modulo(20, 10);
		System.out.println(n);
		
		int o =z.square(10);
		System.out.println(o);
		
		int p =z.cube(5);
		System.out.println(p);
		
		int q=z.average(23, 45, 56, 65, 34);
		System.out.println(q);
		
		
		int r=z.factor(5);
		System.out.println(r);
		
		int s=z.evenodd(10);
		System.out.println(s);
		
	}

}
