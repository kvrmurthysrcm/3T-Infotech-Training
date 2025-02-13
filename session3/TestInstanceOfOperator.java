package session3;

public class TestInstanceOfOperator {
	
	static Person obj1 = new Person();
	static Person obj2 = new Boy();
	
	 public static void main(String[] args)
	    {

	        // As obj is of type person, it is not an
	        // instance of Boy or interface
	        System.out.println("obj1 instanceof Person: "
	                           + (obj1 instanceof Person));
	        System.out.println("obj1 instanceof Boy: "
	                           + (obj1 instanceof Boy));
	        System.out.println("obj1 instanceof MyInterface: "
	                           + (obj1 instanceof MyInterface));

	        // Since obj2 is of type boy,
	        // whose parent class is person
	        // and it implements the interface Myinterface
	        // it is instance of all of these classes
	        System.out.println("obj2 instanceof Person: "
	                           + (obj2 instanceof Person));
	        System.out.println("obj2 instanceof Boy: "
	                           + (obj2 instanceof Boy));
	        System.out.println("obj2 instanceof MyInterface: "
	                           + (obj2 instanceof MyInterface));
	    }
	
	// Classes and Interfaces used are declared here as nested class/interface
	public static class Person {
		
	}

	public static class Boy extends Person implements MyInterface {
		
	}

	public interface MyInterface {
		
	}
}
