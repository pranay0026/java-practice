package examples;

@FunctionalInterface
interface A7{
	void show(int i);
}
@FunctionalInterface
interface A8{
	int add(int i,int j);
}
/***class b3 implements A7{
	public void show(int i) {
		System.out.println("In A7 show");
	}
}***/
public class FUNCTIONAL_INTERFACE {
	public static void main(String[] args) {
	/**A7 obj2=new A7() {
		public void show() {
			System.out.println("In show");
		}
	};**/
	
	//obj2.show();
	//Lambda Expression used with functional interface
		
		A7 obj=(i)->{
			System.out.println("In A7 show bro "+i);
		};
		obj.show(5);
		
		//Return value for Lambda
		A8 obj1=( i, j)-> i+j;
		int result=obj1.add(10, 20);
		System.out.println(result);
		
		
	}
}
