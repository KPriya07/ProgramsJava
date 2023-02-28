package Test;

public class StringDemo {

	public static void main(String[] args) {
		String name="Priya";
				System.out.println(name);
				
				String s=new String("Hello");
				System.out.println(s.toUpperCase());
				String s1=new String("WORLD");
				System.out.println(s.toLowerCase());
				System.out.println(s.length());
				System.out.println(s.equals("World"));
				System.out.println(s.equals("Hello"));
				System.out.println(s1.contains("He"));
				System.out.println(s.contains("Hello"));
				System.out.println(s.charAt(4));
				System.out.println(s.substring(2,5));
				
				StringBuffer b=new StringBuffer("Obsqura");
				System.out.println(b);
				System.out.println(b.append(" Java Training"));
				System.out.println(b.reverse());
				
				StringBuilder b1=new StringBuilder("String Methods");
				System.out.println(b1);
				System.out.println(b1.append("programs"));
				
				System.out.println(s.concat(" Java String Program"));
				System.out.println(s.endsWith("o"));
				System.out.println(s.replace('l', 'p'));
				
				
	}

}
