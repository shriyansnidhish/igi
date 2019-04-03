package com.cognizant.service;

import com.cognizant.model.User;
import com.cognizant.model.UserM;

public interface UserService {
	public int register(User user);
	public int registerM(UserM user);
}
