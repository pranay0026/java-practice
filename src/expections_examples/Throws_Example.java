package expections_examples;
class A{
	public void show() throws ClassNotFoundException{
		Class.forName("Calc");
	}
}

public class Throws_Example  {
	static {
		System.out.println("Class loaded"); //works because main method is present
	}
	public static void main(String[] args) {
		A obj=new A();
		try {
		obj.show();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace(); //hierarcy of the exception
		}
	}
}
