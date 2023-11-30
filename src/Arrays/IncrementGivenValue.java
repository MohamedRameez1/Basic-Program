package Arrays;

import java.util.Scanner;

public class IncrementGivenValue {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,r,reverse=0;
		System.out.println("Enter the n value: ");
		n =s.nextInt();
			while(n!=0)
		{
			r=n%10;
			reverse = reverse *10 +(++r);
			n = n/10;
		}
			
		while(reverse!=0)
			{
		  r=reverse%10;
		  System.out.print(r);
		      
			reverse = reverse/10;

			}
}
}
