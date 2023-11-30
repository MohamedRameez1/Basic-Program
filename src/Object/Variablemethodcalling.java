package Object;

public class Variablemethodcalling {
	int b=100;// instance variable or class variable have the default value
	public static int x; // static variable: no need to create an object to call the variable. 
	public void local_var() {
		int a=10; // local variable does not have the default value.
		System.out.println(a);
		System.out.println(b);
	}
void display() {
	//.out.println(a);
	System.out.println("display b = "+b);
}
	public static void main(String[] args) {
		Variablemethodcalling obj = new Variablemethodcalling();
		obj.local_var();
		obj.display();
		System.out.println(obj.b);
		System.out.println("x = "+x);
	}

}
