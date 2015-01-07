package org.cuatrovientos.camping;

public class MenuAdmin 
	implements MenuInterface {

	@Override
	public void showMenu() {
		System.out.println("1. Show users");
		System.out.println("2. Add user");
		System.out.println("3. Delete user");
		System.out.println("4. Change password");
		System.out.println("5. Exit");
	}

	@Override
	public int readOption() {
		return 0;
	}

	@Override
	public int runOption(int option) {
		// TODO Auto-generated method stub
		return 0;
		
	}


	@Override
	public boolean isExit(int option) {
		// TODO Auto-generated method stub
		return option == 5;
	}

}
