package org.cuatrovientos.camping;

public class Main {
	
	public static void main (String[] args) {
		MenuInterface menu;
		UserInput userInput = new UserInput();
		int option = 0;
		boolean loginCorrect;
		Users users = new Users();
		User currentUser = null;
		while (true) {
		
		do {
			System.out.println("\n\nCamping System");
			String login = userInput.read("Login:");
			String password = userInput.read("Password:");
			
			if (users.isLoginCorrect(login, password)) {
				System.out.println("Login correct, welcome " + login);
				currentUser = users.get(login);
			} else {
				System.out.println("Login incorrect, try again");
			}
		} while (null == currentUser);
		
		switch (currentUser.getProfile()) {
			case User.ADMIN_PROFILE:
									menu = new MenuAdmin();
									break;
			case User.MANAGER_PROFILE:
									menu = new MenuAdmin();
									break;
			case User.USER_PROFILE:
									menu = new MenuAdmin();
									break;
			default:
									menu = new MenuAdmin();
									break;
			
		}
		
		do {
			menu.showMenu();
			option = menu.readOption();
		} while (menu.isExit(option));
		
		}
	}
}
