
public class Program2 {
	/* Test case: 
	 * n= 6, x=4, y=10 with condition(x<y) 
	 * A[]={4,3,7,11,50,1}
	 * output = 7
	 */

	public static void main(String[] args) {
		int arr[]= {4,3,7,11,50,1};
		int n= arr.length;
		int x=10, y=14;
		
		if(x<y) {
			for(int i=0;i<n;i++) {
				if(arr[i]>x && arr[i]<y) {
					System.out.println(arr[i]);
				}
				
			}
			
			
		}
		else {
			System.out.println("Please do enter correct value");
		}

	}

}
