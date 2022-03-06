package com;

public class LockedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", " SR Aishwarya");
		
		HandleOptions.handleWelcomeScreenInput();
	}

}
