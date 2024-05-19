package assignment4;

public class q5 {

	public static void main(String[] args) {
		List l = new List();
		l.addData(97);
		l.addData(37);
		l.addData(35);
		l.addData(54);
		l.addData(47);
		l.addData(44);
		l.display();
	}

}

class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void addData(int value) {
		Node newnode = new Node(value);
		if(head==null)
			head=newnode;
		else if(head.data>value) {
			newnode.next=head;
			head=newnode;
		}
		else {
		Node trav;
		for(trav=head;trav.next!=null && trav.next.data<value;trav=trav.next);
			newnode.next=trav.next;
			trav.next=newnode;
		}
	}
	
	public void display() {
		Node trav=head;
		System.out.print("List: ");
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println("");
	}
}