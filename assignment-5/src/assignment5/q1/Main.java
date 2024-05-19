package assignment5;

public class Main {

	public static void main(String[] args) {
	   Stack st = new Stack();
	   
	   st.push(37);
	   st.push(24);
	   st.push(38);
	   st.push(12);
	   
	   System.out.println("Top element = "+st.peek());
	   System.out.println("Popped element = ");
	   while(!st.isEmpty()) {
		   System.out.print(" "+st.pop());
	   }

	}

}
