package com.virtualkey.util;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainMenu {

	public void DisplayFiles() {
		File folder = new File("/home/gemmadeanvodafo/Desktop/GitProject/VirtualKeyApp/");
        String[] listOfFiles = folder.list();
        Arrays.sort(listOfFiles);
       for (String file : listOfFiles) {
                System.out.println(file);

            }
            

	         
	

	
		
	}}

		

//1. Display files
//2. go to submenu menu
//3.exit	