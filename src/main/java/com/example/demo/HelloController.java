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

	// UC2: Query Parameter
	@GetMapping("/query")
	public String sayHelloQuery(@RequestParam String name) {
		return "Hello " + name + " from BridgeLabz";
	}

}
