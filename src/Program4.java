import java.util.Scanner;

public class Program4 {
	
	// Find the given word is Anagram.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("S1 = ");
		String s1 =s.next();
		System.out.println("S2 = ");
		String s2 =s.next();
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				
				if(s1.charAt(i) == s2.charAt(j)) {
					s2=s2.replaceFirst(""+s1.charAt(i), "");
					break;
				}
				
			}
			
		}
		if(s2.length() == 0) 
			System.out.println("The given word is anagram");
			else
				System.out.println("The given word is not a anagram");
		s.close();
		}
		
	}

		