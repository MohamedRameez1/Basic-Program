package Object;

import java.util.Scanner;

public class Tech_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,result;
		System.out.print("Enter the value: ");
		n =s.nextInt();
		String str1 = String.valueOf(n);
		if(str1.length()==4)
		{
		 result=(int)Math.pow((n/100)+(n%100),2);
		 if(n==result)
			 System.out.println("is a tech number");
		 else
			 System.out.println("is not a tech number");
		}
		else
			System.out.println("not a valid number");
		s.close();
		}
			

	}
