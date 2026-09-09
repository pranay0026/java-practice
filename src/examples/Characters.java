package examples;

public class Characters {
	public static void main(String[] args) {
		char a='a';
		char b='\u0042';
		System.out.println(++b); //unicode 
		System.out.println("Java \"Is Fun\"");
		System.out.println("Java \" is funny\"");
		String s="Fun"+2; //becomes Fun2
		System.out.println(s);
	}
}
