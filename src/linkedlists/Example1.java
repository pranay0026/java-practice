package linkedlists;

import java.util.LinkedList; // implements a doubly linkedlist

public class Example1 {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<>();
		l1.add("Pranay");
		l1.add("Vinay");
		l1.add(1,"AmmU");
		System.out.println(l1);
		l1.set(1,"Ammu");
		for(String s1:l1) {
			System.out.println(s1);
		}
		for(int i=0;i<3;i++) {
			System.out.println(l1.get(i));
		}
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.remove("Vinay");
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2=(LinkedList)l1.clone();
		System.out.println(l2);
		l1.add("Ammu");
		System.out.println(l2);//Pranay
		System.out.println(l1);//Pranay,Ammu
		
	}
}
