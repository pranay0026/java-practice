package threads;

class A extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);//millisecond
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Example1 {
public static void main(String[] args) {
	A obj1=new A();
	B obj2=new B();
	//every thread should have a run method
	/**System.out.println(obj1.getPriority());
	System.out.println(obj2.getPriority()); // the range of priority is from 1 to 10 1-low,5-nrml, 10-high
	obj2.setPriority(Thread.MAX_PRIORITY);
	**/
	obj1.start(); // run method is executed
	obj2.start(); 
	
	
}
}
