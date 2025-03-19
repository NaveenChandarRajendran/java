package com.restapi.learn_springboot_api.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	private HelloWorld helloWorld() {
		return new HelloWorld("Hello World");
	}
	
	@GetMapping(path = "/hello-world-path-variable/{name}")
	private HelloWorld helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorld(String.format("Hello World, %s", name));
	}
	
}
