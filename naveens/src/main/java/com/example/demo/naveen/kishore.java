package com.example.demo.naveen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kishore {
	
	@Value("${value:MAHESH}")
	private String name;
	
	@GetMapping("/")
	public String display() {
		return "Hey... "+name;
	}
}
