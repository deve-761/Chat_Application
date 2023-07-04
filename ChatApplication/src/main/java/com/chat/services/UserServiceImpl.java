package com.chat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.exceptions.LoginException;
import com.chat.exceptions.UserException;
import com.chat.models.User;
import com.chat.repositories.SessionRepo;
import com.chat.repositories.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private SessionRepo usersessiondao;
	
	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser(String uuid) throws UserException {
		if(usersessiondao.findByUuid(uuid) == null) {
			throw new LoginException("login first !");
		}
		List<User> allUsers = userRepo.findAll();
		if(allUsers.isEmpty()) throw new UserException("no User found");
		return allUsers;
		
	}

}
