package Pattern;

import java.util.Scanner;

public class Passcaltriangle {

	public static void main(String[] args) {
	 int n;
	 Scanner s =new Scanner(System.in);
	 System.out.print("enter the n value: ");
	 n= s.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 for(int space=1;space<=n-i;space++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(j+" ");
		 }
		 for(int k=n;k<=n-i;k--)
		 {
			 
			 System.out.print(k+" ");
		 }
		 System.out.println();
	 }

	}

}
