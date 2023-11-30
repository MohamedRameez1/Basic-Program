package Looping;

import java.util.Scanner;

public class Sum_of_the_digits {

	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the n value =");
		n =s.nextInt();
		while(n>0)
		{
			r=n%10;
			sum =sum +r;
			n =n/10;
			}
	System.out.println("sum ="+sum);
	}

	
}
