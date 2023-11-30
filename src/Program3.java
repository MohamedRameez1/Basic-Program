import java.util.Scanner;

public class Program3 {
	
	//Given an array[input].Find the sum of elements present in specified gap n.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int gap =3;
		int output_count =3;
		System.out.println("Enter the array size: ");
		int n = s.nextInt();
		int arr[]= new int[n];
        System.out.println("Enter the array element one by one: ");
        for(int i =0;i<n;i++)
        	arr[i]= s.nextInt();
       
        for(int i=0;i<output_count;i++) {
        	int result =0;
        for(int j=i;j<n;j+=gap) {
        	
        	result = result + arr[j];
        
        }
        System.out.print(result);
        }       	
      s.close();  
	}
    
}
