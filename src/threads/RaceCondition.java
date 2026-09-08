package threads;

class Counter{
	int counter;
	public synchronized void increment() { //one thread access this method at once
		counter++;
	}
}
public class RaceCondition {
	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		Runnable A1=()->{
			//run() method Runnable to running state
			for(int i=1;i<=10000;i++) {
				c.increment();
			}
		};
		Runnable B1=()->{
			for(int i=1;i<=10000;i++) {
				c.increment();
			}
		};
		Thread t1=new Thread(A1); //new state 
		Thread t2=new Thread(B1);
		t1.start();//Runnable
		t2.start();
		//Thread is running in the cpu running state 
		//sleep method keep into the waiting state 
		//Waiting state to in can go to runnable state
		//notify() method the thread goes from waiting to runnable state 
		//stop() For dead state
		t1.join();
		t1.join();
		System.out.println(c.counter);
	}
}
