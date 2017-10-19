package com.she;

import java.util.Set;

public class Customer {

	private String name;
	private Set<Address> add;

	public Customer(String name, Set<Address> add) {
		this.name = name;
		this.add = add;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Address> getAdd() {
		return add;
	}
	
	public void setAdd(Set<Address> add) {
		this.add = add;
	}
	
	
	
}
