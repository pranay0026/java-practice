package examples;


// class->class ->extends
//interface->interface->extends
//class->interface-> implements
interface A3{
	int age=20;       //final and static 
	String area="Eluru";
	void show();
	void config();
}
interface X{
	void run();
}
interface Y extends X{
	void walk();
}
class B2 implements A3,Y{ // we get only methods in implements

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show bro");
	}

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("In config bro");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In run");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Demo3 {
	public static void main(String[] args) {
		A3 obj;
		obj=new B2();
		obj.show();
		obj.config();
		X obj1;
		obj1=new B2();
		obj1.run();
		
		System.out.println(A3.age);
	}
}
