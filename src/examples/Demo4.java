package examples;

enum Status{ //enum is class but it can't be extensible 
	//we can create constructor and methods in Enum
	Running,Failed,Pending,Success; //named constants
}
public class Demo4 {
	public static void main(String[] args) {
		Status s=Status.Running;
		
		System.out.println(s.getClass().getSuperclass());
		/***System.out.println(s.ordinal());
		Status s1=Status.Pending;
		System.out.println(s1);
		Status[] s3=Status.values();
		for(Status x:s3) {
			System.out.println(x );
		}
		switch(s) {
		case Running: System.out.println("All Good");
					break;
		case Failed: System.out.println("All bad");
		            break;
		}**/
	}
}
