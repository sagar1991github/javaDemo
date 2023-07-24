package com.velocity.project;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample2 {

	public static void main(String[] args) {
		try {
			Employee2 emplo1=new Employee2("sagar","Management");
			Employee2 emplo2=new Employee2("samarth","Account");
			Employee2 emplo3=new Employee2("sajjan","maintainance");
			Employee2 emplo4=new Employee2("Sakshi","Account");
			FileOutputStream file=new FileOutputStream("D:\\sagar3\\mayur2.text");
			ObjectOutputStream out2=new ObjectOutputStream(file);
			out2.writeObject(emplo1);
			out2.writeObject(emplo2);
			out2.writeObject(emplo3);
			out2.writeObject(emplo4);
			out2.flush();
			out2.close();
			System.out.println("serialization is successfully done.....");
		}catch(Exception e) {
			System.out.println(e);
		
		}

	}

}