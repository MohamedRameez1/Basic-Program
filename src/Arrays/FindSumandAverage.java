package Arrays;

import java.util.Scanner;

public class FindSumandAverage {

	public static void main(String[] args) {
		int n,sum=0,average;
		Scanner s =new Scanner(System.in);
	
	    System.out.print("Enter the number of values: ");
         n = s.nextInt();

        System.out.println("Enter the values, one at a time:");
        for (int i = 0; i < n; i++) {
            double value = s.nextDouble();
            sum += value;
        }

         average = sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        s.close();
    }
}





