package Looping;

import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args) {
		int n,r,temp,reverse=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n value =");
		n = s.nextInt();
		temp =n;
		while(n>0)
		{
			r =n%10;
			reverse= reverse*10+r;
			n =n/10;
			
		}
		//System.out.println("n="+n);
		//System.out.println("reverse ="+reverse);
		
		if(temp==reverse)
			System.out.println("palidrome");
		else
			System.out.println("not palidrome");
	
	
	}

}
