package com.example.demo.wel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class welc {
@GetMapping("/")
public String get() {
	return "welcome Mahesh";
}
}
