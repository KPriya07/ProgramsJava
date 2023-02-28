package Test;

public class Variables {
	
	int id=101;
	String name="Priya";
	static String college="Obsquara";

	public static void main(String[] args) {
		Variables v1=new Variables();
		v1.display();
		Variables v2 = new Variables();
		System.out.println(v2.id);
		Variables v3 = new Variables();
		System.out.println(v2.name);
		v3.display();
		System.out.println(college);

	}
	void display() {
		//System.out.println(college);
		
	}
	static void show() {
		System.out.println(college);
	}

}
