package Switch_case;

import java.util.Scanner;

public class Naturalnumbers {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("ether the value: ");
		n =s.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum =sum+i;

		}
		System.out.println("the sum of natural number is: "+sum);
	}

}
