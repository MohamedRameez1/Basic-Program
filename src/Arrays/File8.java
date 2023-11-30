package Arrays;

import java.util.Scanner;

public class File8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of elements you want in the array:");
		int n;
		n=s.nextInt();
		int p;
	
		int arr[]=new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0;i<n;i++)	
			arr[i]=s.nextInt();
		System.out.println("Enter the position: ");
	    p =s.nextInt();
	     for(int i=0;i<p;i++)
	    	 System.out.print(arr[i]);
	     for(int i=p;i<n;i++)
	    	 System.out.println(arr[i]);
	  
	     s.close();
	}

}
