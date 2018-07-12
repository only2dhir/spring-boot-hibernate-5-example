/**
 * 
 */
package com.devglan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devglan.dao.UserDao;
import com.devglan.model.UserDetails;
import com.devglan.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public List<UserDetails> getUserDetails() {
		return userDao.getUserDetails();

	}

}
