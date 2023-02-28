/*
 * Program to find the total salary by hand of an Employee
  Class 1 Get basic pay, deduction and bonus from console. 
  
*/


package Assignment;
import java.util.*;

public class One {

	int basicpay;
	int deduction;
	int bonus;
	void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		 basicpay=s.nextInt();
		System.out.println("Enter Deduction amount");
		 deduction=s.nextInt();
		System.out.println("Enter Bonus amount");
		 bonus=s.nextInt();
	} 
		 public static void main(String args[]) {
			
		One one=new One();
		one.display();
	
	
	}
	}


