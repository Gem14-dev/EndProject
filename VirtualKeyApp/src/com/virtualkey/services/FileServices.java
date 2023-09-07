package com.virtualkey.services;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServices {
	

	public void SearchFiles() throws Exception {
		DataInputStream dis1 = new DataInputStream(System.in);
		String filename;
		System.out.println("Please enter the new filename");
		filename = dis1.readLine();
		File file = new File(filename); 
		
		if (file.exists()) {
			System.out.println("File is present");
			} 
			else
			{System.out.println("File is not found");
			}
	}

	public void AddFile() throws IOException {
		
		DataInputStream dis1 = new DataInputStream(System.in);
		String filename;
		System.out.println("Please enter the new filename");
		filename = dis1.readLine();
		File file = new File(filename); 
		
		if (file.exists()) {
		System.out.println("File already exists please select another option to continue");
		} 
		else
		{
	
		DataInputStream dis2 = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream(filename);
		
		System.out.println("Please enter the data");
		int ch;
		while( (ch = dis2.read())!= '\n') {
			fos.write(ch);
		}
		fos.close();
		System.out.println("Data stored in file");
		return; 
	}}

	public void DeleteFile() throws Exception {
		DataInputStream dis1 = new DataInputStream(System.in);
		String filename;
		System.out.println("Please enter the new filename");
		filename = dis1.readLine();
		File file = new File(filename); 
		
		if (file.exists()) {
			file.delete();
			System.out.println("File has been deleted successfully");
			} 
			else
			{System.out.println("File is not found" +filename);
	}

}}
