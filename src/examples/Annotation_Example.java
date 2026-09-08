package examples;

//@Deprecated
class A5{
	public void showTheDataWhichBelongToThisClass() {
		System.out.println("A Show");
	}
}
class B extends A5{
	@Override
	public void showTheDataWhichBelongToThisClass() {
		System.out.println("B's show");
	}
}
public class Annotation_Example {
	public static void main(String[] args) {
		B obj=new B();
		obj.showTheDataWhichBelongToThisClass();
	}
}
