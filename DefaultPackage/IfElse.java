
public class IfElse {

	public static void main(String[] args) {
		method1();
		
		method2();
		nestedIf();

	}
	
	static void nestedIf() {
		int i = 10;

        if (i == 10 || i < 15) {
          
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");

            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(
                    "i is smaller than 12 too");
        }
        else {
            System.out.println("i is greater than 15");
        }
	}
	
	static void method1(){
		int i = 10;

        if (i < 15)          
            // part of if block(immediate one statement
            // after if condition)
            System.out.println("Inside If block");

        // always executes as it is outside of if block
        System.out.println("10 is less than 15");

        // This statement will be executed
        // as if considers one statement by default again
        // below statement is outside of if block
        System.out.println("I am Not in if");
	}
	
	static void method2() {
		int i = 10;

        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");
		
	}

}
