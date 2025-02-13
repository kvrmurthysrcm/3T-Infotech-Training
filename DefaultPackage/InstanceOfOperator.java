
public class InstanceOfOperator {

	String str1 = "aaaaa"; 
			
	public static void main(String[] args) {
		String str = "Programiz";
	    boolean result;

	    // checks if str is an instance of
	    // the String class
	    result = str instanceof String;
	    System.out.println("Is str an object of String? " + result);
	    
	    // result = str instanceof Integer;
	    // System.out.println("Is str an object of String? " + result);
	    
	}
}