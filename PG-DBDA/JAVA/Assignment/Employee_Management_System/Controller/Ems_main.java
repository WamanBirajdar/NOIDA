package controller;
 import model.*;

import java.util.Scanner;

import DAO.*;
 
public class Ems_main {

	public static void main(String[] args) {

		 DbConfig r= new DbConfig();
		 Scanner s1= new Scanner(System.in);
		
		 System.out.println("1 Employee ");
		 System.out.println("2 Department ");
		 int ch=s1.nextInt();
		 
		 if(ch==1)
		 {
			 System.out.println("1  Add Employee ");
			 System.out.println("2 delete Employee ");
			 int crud=s1.nextInt();
			 
			 if( crud==1)
			 {
		  
		 System.out.println("enter  name,id ,address and phone  you want add");
       
         String a= s1.next();
         int b= s1.nextInt();
         String c= s1.next();
         int d= s1.nextInt();
         
         Employee h= new Employee(a,b,c,d);
        
         r.insertData(h);
		 }
			 
			 else if (crud==2)
			 {
				 System.out.println("enter id you want delete");
			             
		         int id= s1.nextInt();
		         r.deleteData(id);
			 }
			 
         
		 }
	}

}
