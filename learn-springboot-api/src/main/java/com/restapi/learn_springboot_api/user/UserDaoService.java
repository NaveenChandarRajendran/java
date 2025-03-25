package com.restapi.learn_springboot_api.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 0;
	
	static {
		users.add(new User(++userCount,"Naveen",LocalDate.now().minusYears(27)));
		users.add(new User(++userCount,"Gayathri",LocalDate.now().minusYears(27)));
		users.add(new User(++userCount,"Diwakaran",LocalDate.now().minusYears(34)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().get();
	}
	
	public void save(User user) {
		user.setId(++userCount);
		users.add(user);
	}

}
