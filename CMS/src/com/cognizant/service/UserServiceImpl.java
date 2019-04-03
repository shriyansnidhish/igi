package com.cognizant.service;

import com.cognizant.model.User;
import com.cognizant.model.UserM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.*;
@Service

public class UserServiceImpl  implements UserService{
	@Autowired
    UserDAO userDAO;
	public int register(User user) {
		
		
		return  userDAO.register(user);
	}
	
	public int registerM(UserM user) {
		// TODO Auto-generated method stub
		return userDAO.registerM(user);
	}

}
