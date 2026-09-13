package examples;

/**class Computer{
	
}
class Laptops extends Computer{
	
}**/
class A11{
	public void show() {
		System.out.println("In A show");
	}
}
class B11 extends A11{
	public void show() {
		System.out.println("In B show");
	}
}


public class DynamicMethodDispatch {
	public static void main(String[] args) {
		A11 obj=new A11(); //obj variable type is A and implementation is B
		obj.show();
		obj=new B11();
		obj.show();
		//Computer obj1=new Laptops();
	}
}
