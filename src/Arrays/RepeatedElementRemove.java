package Arrays;

   // In an given Array remove repeated elements.
import java.util.Scanner;

public class RepeatedElementRemove {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,count, flag=0;
		System.out.println("Enter the array size");
		n =s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");
		System.out.println("The elements are: ");
		for(int i=0;i<n;i++)
		{
		arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j] && i!=j)
                 count++;			
			}
			if(count==0)
			{
				System.out.println(arr[i]+" ");
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("all elements are repeated");
		s.close();
	}
			
}