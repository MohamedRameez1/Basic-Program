package Object;
class A{
	 int  a=10;  // private modifier is visible only inside the class
	private int b=20;
	void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

public class Simple {

	public static void main(String[] args) {
		A obj = new A();
		obj.display();
		System.out.println(obj.a);
		
	}

}
