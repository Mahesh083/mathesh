package com.example.demo.names;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class mahesh {
@GetMapping("/")
public String get() {
	return "welcome springboot";
}
}
