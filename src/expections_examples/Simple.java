package expections_examples;

public class Simple {
	public static void main(String[] args) {
		int i=2;
		int j=0;
		int nums[] = new int[5];
		String str=null; //NullPointerException
		try {
			j=18/i;
			System.out.println(nums[1]);
			System.out.println(nums[5]);
			System.out.println(str.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot access out of bounds element. "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		catch(Exception e) { //parent  class
			System.out.println(e);
		}
		//make sure parent is at the bottom 
		System.out.println(j);
		System.out.println("Bye");
	}
}
