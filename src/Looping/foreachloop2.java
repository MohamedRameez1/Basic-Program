package Looping;

public class foreachloop2 {

	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};// integer array 
		
		for(int x:number) 
		{
			System.out.print(x);
			System.out.print(",");
			}
		System.out.print("\n");
		String[] names = {"james","larry","tom","lacy"}; // String array
		for( String name:names)
		{
			System.out.print(name);
			System.out.print(",");
		}
	}

}
