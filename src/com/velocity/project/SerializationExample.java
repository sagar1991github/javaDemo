package com.velocity.project;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		try {
			Employee emp1=new Employee(2020,"sagar","Management");
			Employee emp2=new Employee(2022,"samarth","Account");
			Employee emp3=new Employee(2019,"sajjan","maintainance");
			Employee emp4=new Employee(2021,"Sakshi","Account");
			FileOutputStream file=new FileOutputStream("D:\\sagar3\\sagar.text");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(emp1);
			out.writeObject(emp2);
			out.writeObject(emp3);
			out.writeObject(emp4);
			out.flush();
			out.close();
			System.out.println("serialization is successfully done.....");
		}catch(Exception e) {
			System.out.println(e);
		
		}

	}

}
