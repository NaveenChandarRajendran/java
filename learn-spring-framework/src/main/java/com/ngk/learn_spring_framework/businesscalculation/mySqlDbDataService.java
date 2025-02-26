package com.ngk.learn_spring_framework.businesscalculation;

import org.springframework.stereotype.Component;

@Component
public class mySqlDbDataService implements DataService {
	public int[] retriveData() {
		return new int[] {11,22,33,44,55};
	}
}
