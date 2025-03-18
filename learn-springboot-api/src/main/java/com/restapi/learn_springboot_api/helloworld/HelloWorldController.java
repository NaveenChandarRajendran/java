package com.restapi.learn_springboot_api.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	private HelloWorld helloWorld() {
		return new HelloWorld();
	}
	
}
