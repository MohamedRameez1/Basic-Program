package Homework;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the n value: ");
		n =s.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			for(int space=0;space<=n-i;space++)
			{
				System.out.print(" ");
			}
				for(int j=i;j>=1;j--)
				{
					System.out.print(j+" ");
				}
				for(int k=2;k<=i;k++)
				{
					System.out.print(k+" ");
				}
				System.out.println();
			}
		s.close();
		}
		

	}


