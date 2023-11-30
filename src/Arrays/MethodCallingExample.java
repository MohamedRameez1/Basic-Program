package Arrays;

import java.util.Scanner;

public class MethodCallingExample {
	void printarray(int n,int arr[])
	{
	System.out.println("Array elements: ");
	for(int i=0;i<n;i++)
	
		System.out.println(arr[i]);
	}
	

	public static void main(String[] args) {
		MethodCallingExample obj = new MethodCallingExample();
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the array element: ");
		n =s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array element one by one: ");
		for(int i=0;i<n;i++)
		
			arr[i]=s.nextInt();
			obj.printarray(n,arr); // METHOD CALLING 
	
			s.close();
	}
}
