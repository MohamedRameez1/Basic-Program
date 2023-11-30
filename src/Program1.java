
public class Program1{
	// Given a unsorted array To find continues pair largest sum Value.

	public static void main(String[] args) {
		int  arr[]  = {1,2,3,4,5};
		int n = arr.length;
        int big=0,sum=0;
        
        
        for(int i=0;i<n-1;i++) {
           sum=	arr[i]+ arr[i+1];
        if(big<sum) {	
              big =sum;
       
        }
        }
        System.out.println("big="+big);
	}
	
		}

