package exemplu;

import java.util.Scanner;

public class Doctor extends User{
	 private int d_id=301;
	 private String d_name="Raju Rastogi";
	 
	 public int getD_id() {
	  return d_id;
	 }

	 public void setD_id(int d_id) {
	  this.d_id = d_id;
	 }

	 public String getD_name() {
	  return d_name;
	 }

	 public void setD_name(String d_name) {
	  this.d_name = d_name;
	 }

	 public void Choice(){
	  System.out.println("Enter your choice:1)CheckPatient");
	  Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        
	        
	   switch(choice){        
	         case 1: CheckPatient();
	          break;
	         case 2: main(null);
	     
	   }
	 }
	 
	 public void CheckPatient(){
	  Patient P = new Patient();
	  String p_name =P.getP_name();
	  int p_id = P.getP_id();
	  System.out.println("Doctor: "+d_name+" has check patient "+p_name);
	 }
}
