package Arrays;

import java.util.Scanner;

public class Test3 {
static void replacelement(int arr[],int n){
			int max,temp;
			max=arr[n-1];
			for(int i=n-2;i>=0;i--) {
				temp=arr[i];
				arr[i]=max;
				if(temp>max)
					max=temp;
			}
			arr[n-1]=0;}
		static void printArray(int arr[],int n) {
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
		}
		
		
			public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int arr[]=new int[n];
			System.out.print("Enter the elements one by one: ");
		for(int i=0;i<n;i++){
			
		
		}
			}

}