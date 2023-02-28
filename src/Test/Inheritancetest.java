package Test;

public class Inheritancetest {

	int University;
	
	Inheritancetest(int University)
	{
		this.University=University;
		System.out.println("University class");
	}
	
	void show()
	{
		System.out.println(University);
	}
	
	public static void main(String[] args) {

		college c1=new college();
		System.out.println(c1.staff);
		ScienceDep s1=new ScienceDep();
		System.out.println(s1.sciencestaff);
		ITDep i1=new ITDep();
		System.out.println(i1.ITStaff);
		ITMCA m1=new ITMCA();
		System.out.println(m1.MCAStaff);
		m1.display();
		
		Inheritancetest t1=new Inheritancetest(10000);
		t1.show();
		
	}

}
