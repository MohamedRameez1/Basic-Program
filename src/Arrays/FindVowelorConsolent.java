package Arrays;

import java.util.Scanner;

public class FindVowelorConsolent {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		char ch =s.next().charAt(0);
		switch (ch)
		{
		case'a'|'A':
		case 'e'|'E':
		case 'i'|'I':
		case 'o'|'O':
		case 'u'|'U':
			System.out.print("vowel");
			break;
			default:
			System.out.println("consolent");
	    	
		}
				
s.close();
	}

}
