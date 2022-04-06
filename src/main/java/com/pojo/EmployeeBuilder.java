package com.pojo;

import java.util.function.Consumer;

public class EmployeeBuilder {
	
	private String first_name;
	private String last_name;
	private String id;
	private String email;
	
	public EmployeeBuilder builder(Consumer<EmployeeBuilder> personbuilder) {
		personbuilder.accept(this);
		return this;		
	}
	
	public Employee build() {
		return new Employee(first_name,last_name,id,email);
	}

}
