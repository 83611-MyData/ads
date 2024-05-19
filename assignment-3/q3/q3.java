package assignment3;

import java.util.Arrays;

public class q3 {

	public static void main(String[] args) {
		int arr[]= {33,27,19,64,34,72,16};
		System.out.println("Intially"+Arrays.toString(arr));
		Stack st = new Stack(arr.length);
		for(int ele :arr) {
			st.push(ele);
		}
		int i=0;
		while (!st.isEmpty()) {
			arr[i]=st.pop();
			i++;
		}
		System.out.println("Intially"+Arrays.toString(arr));
	}

}

class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	public void push(int value) {
		top++;
		arr[top] = value;
	}
	public int pop() {
		return arr[top--];
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public boolean isFull() {
		return top == SIZE-1;
	}
}
