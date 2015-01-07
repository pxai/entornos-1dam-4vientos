package org.cuatrovientos.camping;

public interface MenuInterface {
	public void showMenu();
	public int readOption();
	public int runOption(int option);
	public boolean isExit(int option);
}
