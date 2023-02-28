package Test;

public class student {
	int id;
	
	student(int id){
		this.id=id;
	}
	void display() {
		
		System.out.println(id);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(10);
s1.display();
	}

}
