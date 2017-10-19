package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String name;
	private Engine engine;
	
	public Car() {
	}
	
	public Car(String name, Engine engine) {
		this.name = name;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Engine getEngine() {
		return engine;
	}
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
