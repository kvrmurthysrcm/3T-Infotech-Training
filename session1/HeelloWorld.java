package session1;

public class HeelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.err.println("error message");
		
		if(args != null && args.length > 0) {
			for(int i =0; i < args.length; i++) {
				System.out.println("Args at " + i + " is " + args[i]);
			}
		}

	}

}