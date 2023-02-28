package Test;

public class Test{ 
	
		Test()
{
	System.out.println("hello Test");}  
		
		Test(int a)
{  

	this();  
	System.out.println(a);  
}  
 

  
public static void main(String args[])
{  
Test t1=new Test(10);  
}
}