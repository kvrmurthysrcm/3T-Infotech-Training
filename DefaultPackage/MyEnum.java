
/**
 * 
 * @author Admin
 *
	An enum can, just like a class, have attributes and methods. 
	The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

	An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
	
	Why And When To Use Enums?
	Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.

 */
public class MyEnum {

	enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }

	  public static void main(String[] args) {
	    Level myVar = Level.MEDIUM; 
	    System.out.println(myVar);
	    
	    enumSwitch();
	    forEnum();
	    
	  }

	  static void forEnum() {
		  for (Level myVar : Level.values()) {
			  System.out.println("forEnum: " + myVar);
			}
	  }
	  static void enumSwitch() {
		  Level myVar = Level.HIGH;

		    switch(myVar) {
		      case LOW:
		        System.out.println("Low level");
		        break;
		      case MEDIUM:
		         System.out.println("Medium level");
		        break;
		      case HIGH:
		        System.out.println("High level");
		        break;
		    }
	  }
}