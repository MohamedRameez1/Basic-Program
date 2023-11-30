package Arrays;

public class FindMinandMax {

	public static void main(String[] args) {
	      int[] arr = {10, 5, 8, 2, 7, 15, 3};

	        // Initialize the minimum and maximum values with the first element of the array
	        int min = arr[0];
	        int max = arr[0];

	        // Iterate through the array to find the smallest and greatest elements
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        // Print the smallest and greatest elements
	        System.out.println("The smallest element in the array is: " + min);
	        System.out.println("The greatest element in the array is: " + max);
	        
	
	    }

	}
	