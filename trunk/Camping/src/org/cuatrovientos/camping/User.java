package org.cuatrovientos.camping;

/**
 * POJO class representing system user
 * @author root
 *
 */
public class User {
	private String login;
	private String password;
	private int profile;
	public static final int ADMIN_PROFILE = 0;
	public static final int MANAGER_PROFILE = 1;
	public static final int USER_PROFILE = 2;
	/**
	 * @param login
	 * @param password
	 * @param profile
	 */
	public User(String login, String password, int profile) {
		this.login = login;
		this.password = password;
		this.profile = profile;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the profile
	 */
	public int getProfile() {
		return profile;
	}
	/**
	 * @param profile the profile to set
	 */
	public void setProfile(int profile) {
		this.profile = profile;
	}
	
}
