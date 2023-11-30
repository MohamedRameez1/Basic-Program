package Switch_case;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int stud_id,mark1,mark2,mark3;
		String stud_name;
		float total,Avg;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the student id: ");
		stud_id = s.nextInt();
		System.out.println("enter the student name: ");
		stud_name =s.next();
		System.out.println("enter the mark1: ");
		mark1 =s.nextInt();
		System.out.println("enter the mark2: ");
		mark2 =s.nextInt();
		System.out.println("enter the mark3: ");
		mark3 =s.nextInt();
		total =mark1+mark2+mark3;
		Avg =total/3;
		if(Avg >= 90)
		{
			System.out.println("Excellent ");
			}
		else if(Avg >= 80)
		{
			System.out.println("very good ");
		}
		else if(Avg >=70)
		{
			System.out.println("good ");
				}
		else if(Avg >= 60)
		{
			System.out.println("improve ");
		}
		else if(Avg >=50)
		{
			System.out.println("Work hard ");
		}
		else if(Avg >= 40)
		{
			System.out.println("poor");
		}
		else
		{
			System.out.println("invalid");
		}
		
		
			}
			
	
				
		

	}


