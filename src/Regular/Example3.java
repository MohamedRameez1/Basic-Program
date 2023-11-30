package Regular;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {

	public static void main(String[] args) {
		List <String>words = Arrays.asList("One","Two","Three","four","Six","Mavem","Amen","eleven");
		Pattern p = Pattern.compile(".even"); // reven,seven,ceven
		for(String word: words) {
			Matcher m = p.matcher(word);
			if(m.matches())
				System.out.printf("%s--> matches%n",word);
			else
				System.out.printf("%s--> does not match%n",word);
		}

	}

}
