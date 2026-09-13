package linkedlists;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	public LL() {
		this.size=0;
	}
	public void insertFirst(int val) {
		Node node =new Node(val);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	public void insertLast(int val) {
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	public void insert(int val,int idx) {
		if(idx==0) {
			insertFirst(val);
			return;
		}
		if(idx==size) {
			insertLast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<idx;i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" -> ");
			temp=temp.next;
		}
		System.out.println("END");
		System.out.println(size);
	}
	class Node{
		private int val;
		private Node next;
		public Node(int val) {
			this.val=val;
		}
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
		
	}
	public static void main(String[] args) {
		LL list=new LL();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertLast(40);
		list.insert(75,2);
		list.display();
	}
}
