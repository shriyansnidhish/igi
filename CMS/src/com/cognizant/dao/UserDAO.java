package com.cognizant.dao;


import com.cognizant.model.User;
import com.cognizant.model.UserM;
public interface UserDAO {
  public int register(User user);
  public int registerM(UserM user);
}