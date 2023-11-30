package Looping;

public class Break {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==6 || i==8 )
				//break;
				continue; // continue means mentioned condition value will not print all other values will print.
			else
				System.out.println("i="+i);
			
		}
System.out.println("completed");
	}

}
