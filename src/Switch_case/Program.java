package Switch_case;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the grade");
		char ch=scan.next().charAt(0);
		switch(ch)
		{
		case'A': 
			System.out.println("Excellent!");
		break;
		case'B':
		case'c':
		    System.out.println("Well done");
		break;
		case'D':
		    System.out.println("You passed");
		case'F':
			System.out.println("Better try next time");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is"+ch);
		}


	}

