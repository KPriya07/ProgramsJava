package Test;

public class Inheritance {

	public static void main(String args[]) {
	
		
		Manager m1=new Manager();
		System.out.println(m1.basicsalary);
		System.out.println(m1.bonus);
		Hrmanager h1=new Hrmanager();
		System.out.println(h1.bonus);
		System.out.println(h1.HRA);
		System.out.println(h1.basicsalary);
		Teacher t1=new Teacher();
		System.out.println(t1.PF);
		System.out.println(t1.basicsalary);
		m1.display();
	}
}
