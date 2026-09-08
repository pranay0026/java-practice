package expections_examples;

class PranayException extends Exception{
	public PranayException(String string) {
		super(string);
	}
}
public class SImple2 {
	public static void main(String[] args) {
		int i=20;
		int j=0;
		try {
			j=18/i;
			if(j==0)
				throw new PranayException("I don't want to print zero");
		}
		catch(PranayException e) {
			j=18/1;
			System.out.println("Default output "+e);
		}
		catch(ArithmeticException e) {
			j=18/1;
			System.out.println("Default output "+e);
		}
		catch(Exception e) {
			System.out.println("Some thing went wrong"+e);
		}
		System.out.println(j);
	}
}
