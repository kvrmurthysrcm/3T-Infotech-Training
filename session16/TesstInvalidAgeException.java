package session16;

public class TesstInvalidAgeException {
	
    public static void validate(int age) 
    	      throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validate(12);
        } catch (InvalidAgeException e) {
        	e.printStackTrace();
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
