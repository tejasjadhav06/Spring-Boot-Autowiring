package com.example.Spring_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

	@Autowired
	@Qualifier("desktop")
	private Computer com;
	
	public void build() {
		System.out.println("Working On Awesome Project");
		com.compile();
	}
}
