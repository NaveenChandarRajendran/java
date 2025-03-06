package com.javaLearn.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrenyController {
	
	@Autowired
	private CurrenyServiceConfiguration currenyConfig;
	
	@RequestMapping("/curreny")
	public CurrenyServiceConfiguration getCurrenyConfig(){
		return currenyConfig;
	}

}
