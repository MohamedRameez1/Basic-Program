package Arrays;

import java.util.Scanner;

public class File12 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,temp;
		System.out.print("Enter the array size: ");
		n =s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<n-1;i++)
		{
		 for(int j=0;j<n;j++)
		 {
			 if(arr[i]>arr[j])
			 {
				temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	 // print array by sorting
			System.out.println("After Sorting array elemets are: ");
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
	
				System.out.print("\nsecond smallest: "+arr[1]);
				System.out.println("seconf largest: "+arr[n-2]);
				
				 }
			s.close();
	}
	}

