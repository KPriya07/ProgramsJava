
//method program

//commit to Github after updates wednesday
package Test;
import java.util.*;

public class Employeedemo {
	
	
	String name;
	int id;
		  public void empDetails()
		  {
			  
			  Scanner s=new Scanner(System.in);
			  System.out.println("Enter Employee id");
			  id=s.nextInt();
			  System.out.println("Enter Employee name");
			  name=s.next();
		  }
		  
		  public void display() {
			  
			  System.out.println("Employee id is" +id);
			  System.out.println("Employee name is"+name);
			  
		  }

		  public static void main(String[] args)
		  {
			  
			 Employeedemo ob=new Employeedemo();
			 ob.empDetails();
			ob.display(); 
			  
		  }
		}