package Homework;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		n =s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<=i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
        s.close();
	}

}
