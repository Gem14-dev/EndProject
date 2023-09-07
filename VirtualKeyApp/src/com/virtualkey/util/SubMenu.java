package com.virtualkey.util;


import java.util.Scanner;

import com.virtualkey.services.FileServices;

public class SubMenu {

	public void SubMenuList() throws Exception {
		Scanner sc = new Scanner(System.in);
		int choice;{
		while (true){
			System.out.println("1.Search for a file");
			System.out.println("2:Add a new file");
			System.out.println("3:Delete a file");
			System.out.println("4:Back to main menu");
	
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:FileServices.SearchFiles();
			break;
			case 2:FileServices.AddFile();
			break;
			case 3: FileServices.DeleteFile();
			break;
			case 4:
				return;
			default: System.out.println("Wrong choice, please try again");
			}
		
			
		
	
		
		}
		}}

	
}
	
	
	
	
