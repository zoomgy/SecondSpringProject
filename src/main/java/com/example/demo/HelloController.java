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

	// UC3: Path Variable
	@GetMapping("/param/{name}")
	public String sayHelloPath(@PathVariable String name) {
		return "Hello " + name + " from BridgeLabz";
	}

	// UC4: POST Request with JSON Body
	@PostMapping("/post")
	public String sayHelloPost(@RequestBody UserDTO user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
	}

	// UC5: PUT Request with Path Variable and Query Parameter
	@PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
		return "Hello " + firstName + " " + lastName + " from BridgeLabz";
	}
}
