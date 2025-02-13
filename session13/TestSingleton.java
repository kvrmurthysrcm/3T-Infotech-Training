package session13;

public class TestSingleton {
	
public static void main(String[] args) {
		
		MySingleTon mySingleTon = MySingleTon.getInstance();
		
		System.out.println("fname = " +  mySingleTon.fname ); // using super key word
		
	}

}
