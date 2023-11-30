package Number_methods;

import java.util.Scanner;

public class File3 {

	public static void main(String[] args) {
		// Factorial of given number.
		int n,fact=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the n value: ");
		n =s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact =fact*i;
			
		}
		System.out.println("factorial is= "+fact);
s.close();
	}

}
