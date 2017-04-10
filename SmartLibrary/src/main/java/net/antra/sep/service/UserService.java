package net.antra.sep.service;

import net.antra.sep.pojo.User;
import net.antra.sep.repo.UserRepository;

public class UserService {
	
	private UserRepository userRepo = new UserRepository();
	public User validateUser(String name, String pwd) {
		return userRepo.getUserByNameAndPwd(name, pwd);
	}

}
