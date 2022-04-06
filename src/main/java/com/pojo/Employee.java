package com.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter

public class Employee {

	private String first_name;
	private String last_name;
	private String id;
	private String email;
	
	public Employee(String first_name, String last_name, String id, String email) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
		this.email = email;
	}

		
}
