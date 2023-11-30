package Arrays;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n;
		int temp;
		System.out.print("Enter the array size: ");
		n =s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the array element one by one: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		//sorting the elements
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
     // print array by sorting
			System.out.println("After Sorting array elemets are: ");
			for(int i=0;i<n;i++)
				//for(int i=n-1;i>=0;i--)   //for decending order printing
				System.out.print(arr[i]+" ");
			
		s.close();
	}

}
