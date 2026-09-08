package expections_examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Finally_Example {
 public static void main(String[] args) {
	int i=0;
	int j=0;
	int num=0;
	BufferedReader br=null;
	try {
		j=18/i;
		InputStreamReader in=new InputStreamReader(System.in);
		br=new BufferedReader(in);
		num=Integer.parseInt(br.readLine());
		System.out.println(num);
		//bufferreader is a autoclosable interface
	}
	catch(Exception e) {
		System.out.println("Something went wrong");
	}
	/***finally { //irrespective of exception finally block runs 
		System.out.println("Bye");
		//finally is also used to close the resources
		br.close();
	}**/
	//try should be followed by either catch or finally
}
}
