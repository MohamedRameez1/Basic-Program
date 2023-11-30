package Arrays;

import java.util.Scanner;

public class ArthematicOperation {

	public static void main(String[] args) {
		int n=0 ;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number 1: ");
		int x=s.nextInt();
		System.out.println("Enter the number 2: ");
		int y=s.nextInt();
		n =s.nextInt();
		switch(n)
		{
		case 1:
			int add;
			add= x+y;
			System.out.print("addition ="+add);
			break;
		case 2:
			int sub;
			sub= x-y;
			System.out.print("subtraction ="+sub);
			break;
		case 3:
			int multiply;
			multiply= x*y;
			System.out.print("multiplication ="+multiply);
			break;
		case 4:
			int divide;
			divide= x+y;
			System.out.print("Divition ="+divide);
			break;
		case 5:
			int modulus;
			modulus= x%y;
			System.out.print("modulus ="+modulus);
			break;
		case 6:
			System.exit(0);
		
		
	
		
		}
		s.close();
			

	}

}
