package Number_methods;

public class File4 {
// fibonacci  series program
	public static void main(String[] args) {
		int n=9,f1=0,f2=1, f3;
       System.out.print(f1+ " "+f2+ " ");
       for(int i=2;i<n;i++)
       {
    	   f3= f1+f2;
    	   System.out.print(f3+" ");
    	   f1= f2;
    	   f2= f3;
       }
		
		
	}
	}