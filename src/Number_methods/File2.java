package Number_methods;

public class File2 {

	public static void main(String[] args) {
	 // String buffer
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer("20");
		StringBuffer s3=new StringBuffer("Welcome");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1.length());
	System.out.println(s1.capacity());
	s1.append("ssdd ddddd dddd eee rrr tt ");
	System.out.println(s1.length());
	System.out.println(s1.capacity());
	s1.setLength(5);
	System.out.println(s1.length());
	System.out.println(s1.capacity());
	System.out.print(s1);
	System.out.print(s1.reverse());
}
}
