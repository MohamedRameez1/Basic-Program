package Number_methods;

public class File1 {

	public static void main(String[] args) {
		
		// Wrapper class
		//converting integer object to float or double object.
		Integer x=10;
		Float f = x.floatValue();
		System.out.println(x.floatValue());
		System.out.println("f= "+f);

		//converting primitive data type into objects.
		String str ="10";
		Integer y = Integer.parseInt(str);
		Double d = y.doubleValue();
		System.out.println("y ="+y);
		System.out.println("d ="+d);
		//String str2 =d.toString();
		System.out.println(d.toString());
		System.out.println(String.valueOf(str));
		
		Integer num1=1;
		Integer num2= 10;
		System.out.println(num1.compareTo(num2));
		System.out.println(num2.equals(num2));
		
		String a= "HELLO";
		String b= "HELLO";
		if(a.equals(b))
			System.out.println("Both strings are equal");
		if(a.compareTo(b)==0)
			System.out.println("both the strings are equal");
		Double f1 = -20.54;
		System.out.println("abs ="+Math.abs(4-7));
		System.out.println("ceil ="+Math.ceil(f1)); //lower value of -20.54
		System.out.println("round ="+Math.round(f1)); // round of -20.54
		System.out.println("floor ="+Math.floor(f1)); //higher value of -20.54
		
		System.out.println("minimum value = "+Math.min(12,24));
		System.out.println("maximum value ="+Math.max(12,24));
		System.out.println("Power of = "+Math.pow(2,3));
		
		
	//Excape sequance methods
		System.out.println("excape sequance = \r");
		System.out.println("excape sequance = \n");
		System.out.println("This is \"java\" program"); // to print: This is "java" program.
		
		
	//Character methods 
		System.out.println(Character.isLetter('5'));
		System.out.println(Character.isDigit('1')); // input given should be in character format ex: '1' ,'2' etc
		
		
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isLowerCase('C'));
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('B'));
		
	//String methods
		String str2 = "Welcome"; //ascii value of W= 87
		String str3 = "welcome"; //ascii value of w= 119
		System.out.println(str2.charAt(5));  
		//System.out.println(str2.charAt(10)); // it will give error
		System.out.println(str2.compareTo(str3)); // 87-119 =-37
		System.out.println(str2.compareToIgnoreCase(str3));
		
		System.out.println(str2.concat(str3));
		System.out.println(str2.length());
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(2,7));
		System.out.println(str2.replace('e','a'));
		
		

		
}
}