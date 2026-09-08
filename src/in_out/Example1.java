package in_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) throws IOException {
		/**System.out.println("Enter a number");
		int num=System.in.read(); //reads one character at a time
		System.out.println(num-48); //48 subtract 
		**/
		
		//Way1 to take input
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		int num=Integer.parseInt(bf.readLine());
		System.out.println(num);
		bf.close(); //else you are leaking the data,wasting the resources
		
		//Scanner (1.5)
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println(num1);
		sc.close();
	}
}
