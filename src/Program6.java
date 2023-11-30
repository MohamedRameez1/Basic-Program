
public class Program6 {
	/*From a given array of integers print the next bigger number
	 * for each number in the array.
	 */

	public static void main(String[] args) {
		int arr[]= {8,4,1,9,6,2};
		int n =arr.length;
		
		for(int i =0;i<n;i++) {
			
			int big =Integer.MAX_VALUE;
			
			for(int j=0;j<n;j++) {
				
				if(arr[i]<arr[j]) {
					
					if(arr[j]<big) {
					big = arr[j];
					
				}
			}
		}
			if(big != Integer.MAX_VALUE) {
				System.out.print(arr[i]+"->"+big+",");
			}
				else {
					System.out.print(arr[i]+"->");
				}
			}

	}
}
