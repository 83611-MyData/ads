package assignment5;

public class Stack {
	 static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	 private Node top;
	 public Stack() {
		 top = null;
	 }
	 public boolean isEmpty() {
		 return top == null;
	 }
	 
	 public void push(int value) {
		 Node newnode = new Node(value);
		 newnode.next = top;
		 top = newnode;
	 }
	 
	 public int pop() {
		 if(isEmpty())
			 return -1;
		 int data = top.data;
		 top = top.next;
		 return data;
	 }
	 public int peek() {
		 if(isEmpty())
			 return -1;
		 else
			 return top.data;
	 }

}
