package examples;

class A6{
	public void show() {
		System.out.println("In A show");
	}
	public void config() {
		System.out.println("In A config");
	}
}
class B5 extends A6{
	@Override
	public void show() {
		System.out.println("In B show");
	}
}
public class OverRiddings {
	public static void main(String[] args) {
		B5 obj=new B5();
		obj.show();
		obj.config();
	}
}
