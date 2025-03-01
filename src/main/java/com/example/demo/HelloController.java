package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@RestController
@RequestMapping("/hello")
public class HelloController {

	// UC1: Simple Hello
	@GetMapping
	public String sayHello() {
		return "Hello from BridgeLabz";
	}
}
