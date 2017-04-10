package net.antra.sep.repo;

import java.util.HashMap;
import java.util.Map;

import net.antra.sep.pojo.User;

public class UserRepository {
	private static Map<String, User> userRepository = new HashMap<>();
	
	static{
		userRepository.put("admin", new User("admin",1));
		userRepository.put("a", new User("a",2));
		userRepository.put("Fredrik", new User("Fredrik",3));
	}

	public User getUserByNameAndPwd(String name, String pwd) { // simplified
		return userRepository.get(name);
	}
	
	
}
