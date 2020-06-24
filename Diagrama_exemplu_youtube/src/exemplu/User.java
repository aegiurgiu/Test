package exemplu;

import java.io.*;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		  System.out.println("Enter your choice:1)Receptionist 2)Paient 3)Doctor");
		  Scanner sc = new Scanner(System.in);
		        int choice = sc.nextInt();
		        
		    do{
		   switch(choice){        
		         case 1: Receptionist R = new Receptionist();
		           R.Choice();
		          break;
		         case 2: Patient P = new Patient();
		           P.Choice();
		       break;
		         case 3: Doctor D = new Doctor();
		           D.Choice();
		       break;        
		   }
		        }while(choice!=4);
		 }
		 
}
