package com.virtualkey.main;

import java.util.Scanner;

import com.virtualkey.services.FileServices;
import com.virtualkey.util.MainMenu;
import com.virtualkey.util.SubMenu;

public class DemoTest {

	public static void main(String[] args)  {	
		Scanner sc = new Scanner(System.in);
		String con;
		MainMenu mm = new MainMenu();
		SubMenu sm = new SubMenu();
		int choice;
		do {
			System.out.println("1.Display all files 2:File options 3:Exit");
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:try {
					mm.DisplayFiles();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			case 2:sm.SubMenuList();
			break;
			case 3:
				System.out.println("You have selected to exit");
			break;
			default: System.out.println("Wrong choice, please try again");
			}
			System.out.println("do you want to go back to the main menu (y/n)?");
			con = sc.next();
		}while (con.equalsIgnoreCase("y"));
		
		System.out.println("Finished. Thank you");
		
		sc.close();
		
		
			
		}
		
		
	}



