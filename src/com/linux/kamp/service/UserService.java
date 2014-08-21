package com.linux.kamp.service;

import java.util.Collection;

import com.linux.kamp.dao.UserDao;
import com.linux.kamp.model.User;

public class UserService {

	private UserDao userDao;

	public boolean save(User user) {
		
		// TODO validate username
		// TODO  validate password

		return getUserDao().save(user);

	}

	private UserDao getUserDao() {
		if (this.userDao == null) {
			this.userDao = new UserDao();
		}

		return this.userDao;
	}

	public Collection<Object> getAllUsers() {
		return getUserDao().getAllUsers();
	}

	public boolean checkAuthentication(String username, String password) {
		return getUserDao().checkAuthetication(username, password);
	}
}
