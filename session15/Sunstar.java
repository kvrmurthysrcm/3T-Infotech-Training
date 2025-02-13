package session15;

//Abstract class
abstract class Sunstar {
	
    // Main driver method
    public static void main(String args[])
    {
        // Trying to create an object
    	// Sunstar sunstar = new Sunstar();
    	System.out.println("Inside main method of Sunstar....");
    	Sunstar.demofun();
    }
	
	public Sunstar() {
		System.out.println("Inside Sunstar: abstract class constructor...");
	}
	
    // static method
    static void demofun()
    {
        // Print statement
        System.out.println("static method in abstract class....");
    }
    
	// concrete, final method
    final void fun()
    {
        System.out.println("Base fun() called");
    }
    
    // abstract method
	 abstract void printInfo();
	 
    abstract class MyAbstractInnerClass {
        abstract void myAbstractMethod();
    }
    
	    
}