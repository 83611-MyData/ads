package assignment5;

public class Main {

	public static void main(String[] args) {
		List l = new List();
		
		l.pushFirst(12);
		l.pushFirst(27);
		l.pushLast(24);
		l.pushLast(43);
		l.pushPos(13, 2);
//		l.popPos(3);
		System.out.println("First element : "+l.fwdPeek());
		System.out.println("last element : "+l.backPeek());
		l.Fdisplay();

	}

}
