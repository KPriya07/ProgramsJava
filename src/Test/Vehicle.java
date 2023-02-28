package Test;

public class Vehicle {
	
	int model;
	int vname;
	
	

	public Vehicle(int model) {
	
		//this(10,20);
		this.model = model;
		System.out.println(model);
	}



	public Vehicle(int model, int vname) {
		//super();
		//this.model = model;
		this(model);
		this.vname = vname;
		System.out.println(model);
		System.out.println(vname);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1=new Vehicle(10,20);
		
	}

}
