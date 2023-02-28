//Class 2 Calculate hra (5% of basic pay) and pf (20% of basic pay).
package Assignment;

public class Two {

int hra;
int pf;
	
	void displayHra() {
		
		 hra=(int) (basicpay*0.5);
		 pf=(int) (basicpay*0.2);
		
	System.out.println(hra);
	System.out.println(pf);
	}
}
