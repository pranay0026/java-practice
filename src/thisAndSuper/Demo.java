package thisAndSuper;

class A extends Object{
	public A() {
		System.out.println("In A");
	}
	public  A(int a) {
		System.out.println("In A int");
	}
}
class B extends A{
	public B() {
		//super(); //it's there even without mentioning (every Constructor)
		System.out.println("In B");
	}
	public B(int a) {
		//super(5);
		//this();
		System.out.println("In B int");
	}
}
public class Demo {
	public static void main(String[] args) {
		//B obj=new B();
		B obj1=new B(5);
		//to execute the both the constructors of B use this()
	}
}
