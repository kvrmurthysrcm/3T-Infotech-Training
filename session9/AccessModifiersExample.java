package session9;
import stpious.bsc.Bsc;

public class AccessModifiersExample {

	
	public static void main(String[] args) {
		
		Bsc bsc = new Bsc();
		
		// System.out.println("Bsc: i = " + bsc.i);
		System.out.println("Bsc: i = " + bsc.getI());
		
		System.out.println("Bsc: = " + bsc.getBranches());
		
		// Pls note: following are not available:
		// bsc.j, bsc.k, bsc.l, bsc.getBscBranches();
		
	}
}