package com.virtualkey.util;


import java.io.File;


public class MainMenu {

	public void DisplayFiles() throws Exception {
		File directorypath = new File ("D:/home/gemmadeanvodafo/Desktop/GitProject/ProjectFiles"); 
		String contents[] = directorypath.list();
	      System.out.println("List of files and directories in the specified directory:");
	      for(int i=0; i<contents.length; i++) {
	         System.out.println(contents[i]);
	         
	}

	
		
	}}

		

//1. Display files
//2. go to submenu menu
//3.exit	