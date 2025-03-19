package com.restapi.learn_springboot_api.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Naveen",LocalDate.now().minusYears(27)));
		users.add(new User(2,"Gayathri",LocalDate.now().minusYears(27)));
		users.add(new User(3,"Diwakaran",LocalDate.now().minusYears(34)));
	}
	
	public List<User> findAll() {
		return users;
	}

}
