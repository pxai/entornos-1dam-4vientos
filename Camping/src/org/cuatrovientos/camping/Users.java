package org.cuatrovientos.camping;

import java.util.Hashtable;

/**
 * Represents the database containing users
 * Admin and Manager users are initialized with default values
 * for the sake of simplicity
 * @author Pello Altadill
 *
 */
public class Users 
	extends Hashtable<String,User> {
	
	/**
	 * default constructor
	 */
	public Users () {
		init();	
	}
	
	/**
	 * inits database
	 */
	private void init () {
		this.put("admin",new User("admin","admin",User.ADMIN_PROFILE));
		this.put("manager",new User("manager","manager",User.MANAGER_PROFILE));
		this.put("user",new User("user","user",User.USER_PROFILE));
	}
	
	/**
	 * adds simple user to db
	 * @param login
	 * @param password
	 */
	public void addUser(String login, String password) {
		this.put(login,new User(login,password,User.USER_PROFILE));
	}

	/**
	 * checks if login is correct
	 * @param login
	 * @param password
	 */
	public boolean isLoginCorrect(String login, String password) {
		// First, check if user exists
		if (this.containsKey(login)) {
			// Ok, user exists, check password before changes
			if (this.get(login).getPassword().equals(password)) {
				return true;
			} else { // old password incorrect
				return false;
			}
		} else { // User doesn't exist
			return false;
		}

	}

	/**
	 * changes user's password
	 * @param login
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	public boolean changePassword (String login, String oldPassword, String newPassword) {
		if (this.containsKey(login)) {
			// Ok, user exists, check password before changes
			if (this.get(login).getPassword().equals(oldPassword)) {
				this.get(login).setPassword(newPassword);
				return true;
			} else { // old password incorrect
				return false;
			}
		} else { // User doesn't exist
			return false;
		}
	}
}
