package com.hayturno.dao;

import com.hayturno.entities.User;

import java.util.List;


public interface UserManagerDao
{
	User fetchUserById(Integer id);

	List<User> fetchAllUsers();

	void insertUser(User user);

	void updateUser(User user);

	void deleteUser(User user);
}
