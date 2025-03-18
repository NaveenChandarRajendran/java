package com.restapi.learn_springboot_api.helloworld;

public class HelloWorld {
	private String helloWorldText = "Hello World";

	public String getHelloWorldText() {
		return helloWorldText;
	}

	@Override
	public String toString() {
		return "HelloWorld [helloWorldText=" + helloWorldText + "]";
	}
}
