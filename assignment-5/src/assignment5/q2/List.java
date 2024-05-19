package assignment5;

public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}
	private Node head;
	private Node tail;
	
	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void pushFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = tail = newnode;
		}
			else {
				newnode.next = head;
				head.prev = newnode;
				head = newnode;
			}	
	}
	public void pushLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = tail = newnode;
		}
		else {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;
		}
	}
	public void pushPos(int value , int pos) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = tail = newnode;
		else if(pos <= 1)
			pushFirst(value);
		else {
			Node trav = head;
			for(int i = 1 ;i < pos - 1 && trav.next != null ; i++)
				trav = trav.next;
			if(trav == tail) {
				pushLast(value);
				return;
			}
			newnode.next = trav.next;
			newnode.prev = trav;
			trav.next.prev = newnode;
			trav.next = newnode;
				
		}
	}
	public void popFirst() {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			head.next.prev = null;
			head = head.next;
		}
	}
	public void popLast() {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			tail.prev.next = null;
			tail = tail.prev;
		}
	}
	public void popPos(int pos) {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
	}
	public int fwdPeek() {
		if(isEmpty())
			return -1;
		else
			return head.data;
	}
	public int backPeek() {
		if(isEmpty())
			return -1;
		else
			return tail.data;
	}
	public void Fdisplay() {
		Node trav = head;
		System.out.print("Forward list : ");
		while(trav != null) {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
	}
	public void Bdisplay() {
		Node trav = tail;
		System.out.print("Backward list : ");
		while(trav != null) {
			System.out.print(" "+trav.data);
			trav = trav.prev;
		}
	}
	
	
	
			
}






























