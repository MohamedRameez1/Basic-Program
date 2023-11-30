package Regular;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

		public static void main(String[] args) {
		List < String > names = new ArrayList < String >
		();
		names.add ("Imacticus");
		names.add ("Imacticus123");
		names.add ("Imarticus-----////"); //Incorrect
		String regex = "^ [a-zA-Z0-9]+$";
		Pattern pattern = Pattern. compile (regex);
		for (String name: names) {
		Matcher matcher = pattern. matcher (name);
		System.out.println(matcher.matches());
	}
		}
	}


