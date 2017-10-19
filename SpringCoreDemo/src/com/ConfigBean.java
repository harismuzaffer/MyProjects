package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

	@Bean(name="car")
	public Car car(){
		return new Car();
	}
	
	@Bean
	public Engine engine(){
		Engine e= new Engine();
		e.setType("engine-199");
		return e;
	}
}
