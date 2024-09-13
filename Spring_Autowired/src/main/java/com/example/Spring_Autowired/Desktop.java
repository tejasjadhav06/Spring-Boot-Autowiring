package com.example.Spring_Autowired;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

	public void compile() {
		System.out.println("I am from Desktop Class");
	}

}
