package Looping;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int n; // number of array elements =5
		Scanner s = new Scanner(System.in);
		System.out.print("enter th number of elements =");
		n =s.nextInt(); // n=5
		int arr[] = new int[n]; // int arr[] = new int[5];
		String array1[] = new String[n]; //for string value input
		System.out.println("enter the array element one by one =");
		for(int i=0;i<n;i++) 
		{// 0 to 4 =5
			array1[i]=s.next(); 
	}
		System.out.println("output: ");
		for(int i=0;i<n;i++) { //0to5 =6
		System.out.println(arr[i]);
		}
			
		

	}

}
