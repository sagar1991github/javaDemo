package com.velocity.project;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID=-1234564667;
    long id;
	String name;
	String department;
	
	 public Employee(long id,String name,String department) {
		 
		 this.id=id;
		 this.name=name;
		 this.department=department;
		 
	 }

}
