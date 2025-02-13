package session9;
import java.lang.reflect.Constructor;

public class CreateObject implements Cloneable
{

	int i = 0;
	int k = 10;
	String info = "I am Pious";
	
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	public static void main(String[] args) {


		/***************** Option 1 *****************/
		// As usual and most generic used we will 
        // be creating object of class inside main() 
        // using new keyword 
		CreateObject obj = new CreateObject(); 
		
        // Print and display the object 
        System.out.println("Create Object using New keyword: info = "+ obj.info); 
        
        /***************** Option 2 *****************/
        getInstance();
        
        /***************** Option 3 *****************/
        cloneObject(obj);
        
        /***************** Option 4 *****************/
        reflection();
        /***************** Option 5 *****************/
        // serialize the object:: 
        // TODO 
        
	}

	private static void reflection() {
		
		// Try block to check for exceptions 
        try { 
            Constructor<CreateObject> constructor 
                = CreateObject.class.getDeclaredConstructor(); 
  
            CreateObject r = constructor.newInstance(); 
  
            r.setInfo("I am Pious -- set using Reflection..."); 
            System.out.println("Create Obj using Reflection:: " + r.getInfo()); 
        } 
  
        // Catch block to handle the exceptions 
        catch (Exception e) { 
  
            // Display the exception on console 
            // using printStackTrace() method 
            e.printStackTrace(); 
        } 
		
	}

	private static void cloneObject(CreateObject obj) {
		// Try block to check for exceptions 
        try { 
            // Using the clone() method 
        	CreateObject obj2 = (CreateObject)obj.clone(); 
  
            // Print and display the main class object 
            // as created above 
            System.out.println("Create Object using clone() info = " + obj2.info); 
        } 
        // Catch block to handle the exceptions 
        catch (CloneNotSupportedException e) { 
            // Display the exception 
            // using printStackTrace() method 
            e.printStackTrace(); 
        }	
	} // End of cloneObject()
	
	/*
	 * option 2: using newInstance() 
	 */
	private static void getInstance() {
		// Try block to check for exceptions 
        try { 
  
            Class cls = Class.forName("CreateObject"); 
  
            // Creating object of main class 
            // using instance method 
            CreateObject obj = (CreateObject) cls.newInstance(); 
  
            // Print and display 
            System.out.println("CreateObject using newInstance(): info = " + obj.info); 
        } 
        // Catch block to handle the exceptions
        // Catch block 1 
        // Handling ClassNotFound Exception 
        catch (ClassNotFoundException e) { 
            // Display the exception along with line number 
            // using printStacktrace() method 
            e.printStackTrace();
            System.out.println("Exception occured while CreateObject using newInstance(): = " + e.getMessage()); 
        } 
        // Catch block 2 
        // Handling InstantiationException 
        catch (InstantiationException e) { 
            e.printStackTrace(); 
            System.out.println("Exception occured while CreateObject using newInstance(): = " + e.getMessage());
        } 
        // Catch block 2 
        // Handling IllegalAccessException 
        catch (IllegalAccessException e) { 
            e.printStackTrace(); 
            System.out.println("Exception occured while CreateObject using newInstance(): = " + e.getMessage());
        }
	} // End of getInstance()

}