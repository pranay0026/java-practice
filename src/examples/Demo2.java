package examples;

abstract class Abs{
	public abstract void show();
	public abstract void config();
}
/**class B extends Abs{
	public void show() {
		System.out.println("In B show2");
	}
}**/
public class Demo2 {
	public static void main(String[] args) {
		// to implement abstract only once
		Abs obj=new Abs()
		{
			public void show() {
				System.out.println("In new Show");
			}
			public void config() {
				System.out.println("In config");
			}
		};
		obj.show();
		
	}
}
