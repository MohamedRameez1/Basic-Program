package Arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int flag =0;
		n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
				System.out.println(arr[i]+" ");
				flag=1;

			}
		}
		
	if(flag==0)
		System.out.println("no duplicates");
	s.close();

}
}
}