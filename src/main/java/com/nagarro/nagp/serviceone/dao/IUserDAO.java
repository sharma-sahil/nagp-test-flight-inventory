package com.nagarro.nagp.serviceone.dao;

import java.util.List;

import com.nagarro.nagp.serviceone.dto.CreateUserRequest;
import com.nagarro.nagp.serviceone.model.User;

/**
 * The Interface IUserDAO.
 */
public interface IUserDAO {

	/**
	 * Creates the user.
	 *
	 * @param user
	 *            the user
	 * @return the user
	 */
	public User createUser(CreateUserRequest user);

	/**
	 * Gets the user.
	 *
	 * @param userId
	 *            the user id
	 * @return the user
	 */
	User getUser(long userId);

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	List<User> getAllUsers();

	/**
	 * Update user.
	 *
	 * @param user the user
	 */
	void updateUser(User user);

}
