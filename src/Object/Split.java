package Object;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String vowels ="a:bc:de:fg:h";
		// splitting array at":"
		// limit is -2; array contains all substrings
		String[]result = vowels.split(":",-2);
		System.out.println("Result when limit is -2="+Arrays.toString(result));
		
		// limit is 0
		result = vowels.split(":",0);
		System.out.println("Result when limit is 0="+Arrays.toString(result));
		
		// limit is 2
		result = vowels.split(":",2);
		System.out.println("Result when limit is 2="+Arrays.toString(result));

		// limit is 4
		result = vowels.split(":",4);
		System.out.println("Result when limit is 4="+Arrays.toString(result));
		
		// limit is 10
		result = vowels.split(":",10);
		System.out.println("Result when limit is 10="+Arrays.toString(result));
		
		// for splitting the string at"+"
		// String[] = vowels.split("\\+");
	}

}
