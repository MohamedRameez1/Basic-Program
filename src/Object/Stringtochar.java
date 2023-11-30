package Object;

import java.util.Arrays;

public class Stringtochar {

	public static void main(String[] args) {
		String st ="This is great";
		String text="Java is a programming language";
		char[] chars = st.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			System.out.print(chars[i]+" ");
		}
		
			System.out.println(Arrays.toString(chars));
		
		
	//split string from space
		String[] result= text.split(" ");
		System.out.println("Result =");
		for(String str:result)
		{
			System.out.print(str+",");
		}

	}

}
