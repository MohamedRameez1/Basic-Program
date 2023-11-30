package Pattern;

import java.util.Scanner;

public class Programwithnumbers {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the n value: ");
		n =s.nextInt();
		for(int i=1;i<=n;i++)
		{
    /* for(int space=1;space<n;space++)
     {
    	 System.out.print("");
     }*/
     for(int j=1;j<=i;j++)
     {
    	 System.out.print(j);
     }
     System.out.println();
	}
		s.close();
}
}
