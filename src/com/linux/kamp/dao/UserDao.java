package com.linux.kamp.dao;

import java.util.Collection;

import com.linux.kamp.FakeDb;
import com.linux.kamp.model.User;

public class UserDao {

	public boolean save(User user) {

		if (user.getId() == null || user.getId().trim().length() == 0) {
			String id = String.valueOf(System.currentTimeMillis());
			user.setId(id);
		}

		FakeDb.save(user.getId(), user);

		return true;
	}

	public Collection<Object> getAllUsers() {
		return FakeDb.getAllUsers();

	}

	public boolean checkAuthetication(String username, String password) {
		for (Object u : FakeDb.getAllUsers()) {

			try {
				User user = (User) u;

				if (user.getName().equals(username)
						&& user.getPassword().equals(password)) {
					return true;
				}

			} catch (Exception e) {
				// ignore
			}
		}
		return false;

	}

}
