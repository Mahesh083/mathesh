package com.example.demo.color;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getcolor {
@GetMapping("/")
public String get() {
	String color="red";
	return "my favourite colour is"+color;
}
}
