package Test;

public class StringPalindrome {
	
	
		  public static void main(String[] args) {

			  
			  String s="Java";
			  String s1="Malayalam";
			  String r1="";
			  String r2="";
			  int slength=s.length();
			  int s1length=s1.length();
	
			  
			  for(int i=(slength-1);i>=0;i--) {
					  
			  r1=r1+s.charAt(i);
			
			  }
			  if(s.toLowerCase().equals(r1.toLowerCase())){
				  System.out.println(s+ "Palindrome");
			  
			  }
			  else {
				  System.out.println(s+ "is not a Palindrome"); 
			   }
			  
			 for(int j=(s1length-1);j>=0;j--){
			  
			  r2=r2+s1.charAt(j);
			 }
			  if(s1.toLowerCase().equals(r2.toLowerCase())){
				  System.out.println(s1+  "Palindrome");
			  
			  }
			  else {
				  System.out.println(s1+ "is not a Palindrome"); 
			   }
		  }
}

			  
			   
		  
				
		 
		
		