import java.util.Arrays;
import java.util.Scanner;

public class Program5 {
	
  /* Given an array of integers,rearrange the array such that
   * every second element of the array is greater than its left and right elements.
   * Assume no duplicate elements are present in the array.
   */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n =s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the array element one by one: ");
		for(int i =0;i<n;i++)
		arr[i]=s.nextInt();
		
		Arrays.sort(arr);
		
		System.out.println("After sorting: ");
		for(int i =0;i<n;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		
		
		for(int i =1;i<n;i+=2) {
			
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]= temp;
		
		}
		System.out.println("Result: ");
		for(int i =0;i<n;i++) {
			System.out.print(+arr[i]+" ");
		}
		
				
s.close();
	}

}
