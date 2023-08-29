package com.virtualkey.util;

import java.io.IOException;
import java.util.Scanner;

import com.virtualkey.services.FileServices;

public class SubMenu {

	public void SubMenuList() {
		Scanner sc = new Scanner(System.in);
		String con;
		FileServices fs = new FileServices ();
		int key;
		int choice;{
		while (true){
			System.out.println("1.Search for a file 2:Add a new file 3:Delete a file 4:Back to main menu");
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:fs.SearchFiles();
			break;
			case 2:
				try {
					fs.AddFile();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			case 3: fs.DeleteFile();
			break;
			case 4:
				return;
			default: System.out.println("Wrong choice, please try again");
			}
			
			
			
		
	
		
		}
		}
		}
}
	
	
	
	
	



//1.View files
//2.Search files
//3. Add new file
//4.Delete file
//5. back to main menu