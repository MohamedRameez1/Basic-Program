package Arrays;

import java.util.Scanner;

public class Remove_Duplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,count=0;
		System.out.println("Enter the array size: ");
		n =s.nextInt();
		int arr[]=new int[n];
		int temp[] = new int[n];
		System.out.println("Enter the array elements of indes: ");
		for(int i=0;i<n;i++)
		{	
		arr[i]=s.nextInt();
	}
		System.out.println("Before removing duplicate elements are: ");
		for(int i=0;i<n;i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
		
			System.out.println("After removing duplicate elements are: ");
			for(int i=0;i<n;i++)
			{
		        int flag=0;
				if(i==0)
					temp[count++]=arr[i];
					else
					{
						for(int j=0;j<count;j++)
						{
							if(arr[i]==temp[j])
									flag=1;
						}
						if(flag==0)
							temp[count++]=arr[i];
			}
		}
	
		for(int i=0;i<count;i++)
			System.out.print(temp[i]+" ");
	
		s.close();
	}
	}

