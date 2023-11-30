package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("java Training",Pattern.CASE_INSENSITIVE);
	Matcher matcher = pattern.matcher("Welcome java Training");
	boolean matchFound = matcher.find();
	if(matchFound) 
		System.out.println("match found");
	 else
			System.out.println("match not found");
		
	}
	}

