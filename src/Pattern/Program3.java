package Pattern;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		n =s.nextInt();
		for(int i=1;i<=n;i++)
		{
			/*for(int space=1;space<i;space++)
			{
				System.out.print(" ");
			}*/
			for(int j=n;j>=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		s.close();
	}
		
}
