package Arrays;


  // In the given set of array find the no. of occurrence of the given number.

import java.util.Scanner;

public class Occurrence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,element,count=0;
		System.out.print("Enter the number of elements you want in the array: ");
		n =s.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter all the elements: ");
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();

		System.out.print("Enter the elemts of which you want to" +" count number of occurences: " );
		element =s.nextInt();
		for(int i=0;i<n;i++)
		{
               if(arr[i]==element)
				count++;
		}
	
	if(count==0)
		System.out.println("element not present");
	else
		System.out.println("number of occurance of the element is: "+count);
		s.close();
	}


}

