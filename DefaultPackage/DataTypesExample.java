
public class DataTypesExample {

	public static void main(String[] args) {
        // Primitive Data Types
        int age = 30;          // Integer
        double price = 19.99;  // Double
        boolean isActive = true; // Boolean
        char grade = 'A';      // Character

        // Reference Data Type
        String name = "Alice"; // String (object)

        // Implicit and Explicit Casting
        double decimalValue = 10.5;
        int integerValue = (int) decimalValue;  // Explicit casting

        // Print values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is Active: " + isActive);
        System.out.println("Grade: " + grade);
        System.out.println("Decimal value: " + decimalValue);
        System.out.println("Integer value (after casting): " + integerValue);
    }
	
	/**
	 *
	 - ** Key Points to Remember:
		- **Primitive types** are faster and use less memory because they store actual values.
		- **Reference types** are more flexible, allowing you to work with objects, arrays, and more.
		- **Type casting** (both implicit and explicit) is used to convert between different types,
		- but be mindful of potential data loss when narrowing types.	
	*/
}
