package com.voda.project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Project {

 String strPath = "", strName = "";
    
 public void Reader() throws IOException
 {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the file name:");
     strName = br.readLine();
     System.out.println("Enter the file path:");
     strPath = br.readLine();
 }
 public void newFile()
 {
     try 
     {
    	Reader();
        File file = new File(strPath + "" + strName);
 		if(file.createNewFile())
 		{
 			System.out.println("File Created");
 		}
 		else {
 			System.out.println("File Already Exist");
 		}
    }
     catch (Exception e) {
     }
 }
 public void deleteFile()
 {
		try 
		{
			Reader();
			Files.deleteIfExists(Paths.get(strPath + "" + strName));
		} 
		catch (NoSuchFileException e) {
			System.out.println("No such file or directory exist");
		}
		catch(DirectoryNotEmptyException e) {
			System.out.println("Directory not Empty Exception");
		}
		catch(IOException e)
		{
			System.out.println("Invalid permissions");
		}
		
		System.out.println("File Deleted Successfully");

	}
 public void  searchfile() throws IOException
 {
	 Reader();
     File directory = new File(strPath);
     String[] filelist = directory.list();
     int flag = 0;
     if (filelist == null) {
         System.out.println("Empty directory.");
     }
     else {
         for (int i = 0; i < filelist.length; i++) {
             String filename = filelist[i];
             if (filename.equalsIgnoreCase(strName)) {
                 System.out.println(filename + " found");
                 flag = 1;
             }
         }
     }
     if (flag == 0) {
         System.out.println("File Not Found");
     }
 }

 public void BubbleSortAsce()  throws IOException
 {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the file path:");
     strPath = br.readLine();
     File directory = new File(strPath);
     String[] filelist = directory.list();
     if (filelist == null) {
         System.out.println("Empty directory.");
     }
     else 
     {
         for (int j=0; j<filelist.length-1; j++) 
         {
             for (int i=0; i<filelist.length-1; i++) 
             {
                 if (filelist[i].compareTo(filelist[i+1]) > 0) {
                     String temp = filelist[i];
                     filelist[i] = filelist[i+1];
                     filelist[i+1] = temp;
                 }
             }
         }
         for(String files:filelist)
         	System.out.println(files);
     }
 }
 public static void main(String args[]) throws IOException
 {
	 int a=0;
	 int b=0;
	 int c=0;
	 while(c==0)
	 {		 
	 Project project = new Project();  
	 System.out.println("***************************Welcome Users*********************************");
	 System.out.println("********************************************************************************");
	 System.out.println(":: Kindly choose type of operation to proceed with ::");
	 System.out.println("  1- List directory files: ");
	 System.out.println("  2- Manipulate files ");
	 System.out.println("  3- Exit program");
	 Scanner sc= new Scanner(System.in);
	 System.out.print("Enter number : ");  
	 a= sc.nextInt();  
	 if (a==1)
	 {	
		 b=0;
		 project.BubbleSortAsce();
		 Scanner src= new Scanner(System.in);
		 System.out.println("  1- Return to main page: ");
		 System.out.println("  2- Exit program ");
		 System.out.print("Enter number : ");  
		 b= src.nextInt();  
		 if(b==1)
		 {
			 System.out.println("  program");
		 }
		 else if(b==2)
		 {
			 System.exit(0);
		 }
		 else
		 {
			 System.out.println("Invalid input");
		 }
	 }
	 else if(a==2)
	 {		
		 a=0;
		 System.out.println("  1- Add file ");
		 System.out.println("  2- Delete file");
		 System.out.println("  3- Search file");
		 System.out.println("  4- Exit program");
		 Scanner src= new Scanner(System.in);
		 System.out.print("Enter number : ");  
		 a= src.nextInt();  
		 if(a==1)
		 {			 
			 b=0;
			 project.newFile();
			 Scanner scc= new Scanner(System.in);
			 System.out.println("  1- Return to main page: ");
			 System.out.println("  2- Exit program ");
			 System.out.print("Enter number : ");  
			 b= scc.nextInt();  
			 if(b==1)
			 {
				 System.out.println("  program");
			 }
			 else if(b==2)
			 {
				 System.exit(0);
			 }
			 else
			 {
				 System.out.println("Invalid input");
			 } 
		 }
		 else if(a==2)
		 {
			 b=0;
			 project.deleteFile();
			 Scanner scc= new Scanner(System.in);
			 System.out.println("  1- Return to main page: ");
			 System.out.println("  2- Exit program ");
			 System.out.print("Enter number : ");  
			 b= scc.nextInt();  
			 if(b==1)
			 {
				 System.out.println("  program");
			 }
			 else if(b==2)
			 {
				 System.exit(0);
			 }
			 else
			 {
				 System.out.println("Invalid input");
			 } 
		 }
		 else if(a==3)
		 {
			 b=0;
			 project.searchfile();
			 Scanner scc= new Scanner(System.in);
			 System.out.println("  1- Return to main page: ");
			 System.out.println("  2- Exit program ");
			 System.out.print("Enter number : ");  
			 b= scc.nextInt();  
			 if(b==1)
			 {
				 System.out.println("  program");
			 }
			 else if(b==2)
			 {
				 System.exit(0);
			 }
			 else
			 {
				 System.out.println("Invalid input");
			 } 
		 }
		 else if(a==4)
		 {
			 System.exit(0);
		 }
		 else
		 {
			 System.out.println("Invalid input");
		 }
	 }
	 else if(a==3)
	 {
		 System.exit(0);
	 }
	 else
	 {
		 System.out.println("Invalid input");
	 }
 }
 }
 }
 