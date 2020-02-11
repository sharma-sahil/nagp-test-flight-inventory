package com.nagarro.nagp.serviceone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.serviceone.dto.AccountDTO;
import com.nagarro.nagp.serviceone.dto.CreateUserRequest;
import com.nagarro.nagp.serviceone.dto.UpdateAccountRequest;
import com.nagarro.nagp.serviceone.dto.UpdateUserInfoRequest;
import com.nagarro.nagp.serviceone.dto.UserDTO;
import com.nagarro.nagp.serviceone.exception.InvalidParameterException;
import com.nagarro.nagp.serviceone.service.IUserService;
import com.nagarro.nagp.serviceone.validator.InputValidator;

/**
 * The Class UserController.
 */
@RestController
public class UserController {

	/** The user service. */
	@Autowired
	private IUserService userService;

	/**
	 * Creates the user.
	 *
	 * @param user
	 *            the user
	 * @return the user DTO
	 * @throws InvalidParameterException
	 */
	@PostMapping(value = "/user")
	public UserDTO createUser(@RequestBody final CreateUserRequest user) throws InvalidParameterException {
		InputValidator.validateCreateUserRequest(user);
		return this.userService.createUser(user);
	}

	/**
	 * Gets the user.
	 *
	 * @param id
	 *            the id
	 * @return the user
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@GetMapping(value = "/user/{id}")
	public UserDTO getUser(@PathVariable("id") final long id) throws InvalidParameterException {
		return this.userService.getUser(id);
	}

	/**
	 * Update user details.
	 *
	 * @param id
	 *            the id
	 * @param request
	 *            the request
	 * @return the user DTO
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@PutMapping(value = "/user/{id}")
	public UserDTO updateUserDetails(@PathVariable("id") final long id, @RequestBody UpdateUserInfoRequest request)
			throws InvalidParameterException {
		return this.userService.updateUserInfo(id, request);
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	@GetMapping(value = "/user")
	public List<UserDTO> getAllUser() {
		return this.userService.getAllUsers();

	}

	/**
	 * Gets the user.
	 *
	 * @param id
	 *            the id
	 * @return the user
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@GetMapping(value = "/user/{id}/accounts")
	public List<AccountDTO> getUserAccounts(@PathVariable("id") final long id) throws InvalidParameterException {
		return this.userService.getUserAccounts(id);
	}

	/**
	 * Gets the account.
	 *
	 * @param accountNumber
	 *            the account number
	 * @return the account
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@GetMapping(value = "/accounts/{accountNumber}")
	public AccountDTO getAccount(@PathVariable("accountNumber") final String accountNumber)
			throws InvalidParameterException {
		return this.userService.getAccount(accountNumber);
	}

	/**
	 * Update account details.
	 *
	 * @param accountNumber
	 *            the account number
	 * @param request
	 *            the request
	 * @return the account DTO
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@PutMapping(value = "/accounts/{accountNumber}")
	public AccountDTO updateAccountDetails(@PathVariable("accountNumber") final String accountNumber,
			@RequestBody UpdateAccountRequest request) throws InvalidParameterException {
		return this.userService.updateAccountDetails(accountNumber, request);
	}

}
