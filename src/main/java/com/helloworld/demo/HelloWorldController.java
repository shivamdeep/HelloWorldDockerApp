package com.helloworld.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping
	public String helloworld() {
		return "HelloWorld!!!";
	}
}
