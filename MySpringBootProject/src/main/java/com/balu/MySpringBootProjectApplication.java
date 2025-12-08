package com.balu;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.balu")
public class MySpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootProjectApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {  //This ModelMapper is used to convert DTO to Entity and Entity to DTO easily
		return new ModelMapper();
	}

}
