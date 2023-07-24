package com.velocity.project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmployee {

	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("D:\\sagar3\\sagar.text");
			ObjectInputStream in =new ObjectInputStream(file);
			Object obj1=in.readObject();
			Object obj2=in.readObject();
			Object obj3=in.readObject();
			Object obj4=in.readObject();
			
			Employee e1=(Employee) obj1;
			Employee e2=(Employee) obj2;
			Employee e3=(Employee) obj3;
			Employee e4=(Employee) obj4;
			
			System.out.println(e1.id+"= "+e1.name+"= "+e1.department);
			System.out.println(e2.id+"= "+e2.name+"= "+e2.department);
			System.out.println(e3.id+"= "+e3.name+"= "+e3.department);
			System.out.println(e4.id+"= "+e4.name+"= "+e4.department);
			//System.out.println(e1);
			in.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
				

	}

}
