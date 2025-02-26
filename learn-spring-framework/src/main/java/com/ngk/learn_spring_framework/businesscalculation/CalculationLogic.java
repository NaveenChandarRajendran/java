package com.ngk.learn_spring_framework.businesscalculation;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class CalculationLogic {
	private DataService dataService;
	
	public CalculationLogic (DataService dataService) {
		super();
		this.dataService = dataService;
	};
	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
