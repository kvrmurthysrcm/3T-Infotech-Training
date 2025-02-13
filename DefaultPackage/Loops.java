
public class Loops {

	public static void main(String[] args) {
		forLoop();
		
		whileLoop();
		
		forBreak();
		
		forContinue();
		
		forReturn();
		
	}

	static void forLoop() {
		for(int x=0; x<=5; x++){
            System.out.println("Inside forloop:: "+ x);
        }
	}
	
	static void forReturn() {
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
				  System.out.println("forReturn: returning now " + i);
			    return;
			  }
			  System.out.println("forReturn: " + i);
			}
	}
	
	static void forContinue() {
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println("forContinue: " + i);
			}
	}
	
	static void forBreak() {
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
				  System.out.println("forBreak from loop: " + i);
			    break;
			  }
			  System.out.println("forBreak: " + i);
			}	
	}
	
	static void whileLoop() {
		int myNumber = 1;
		   while(myNumber != 100) {
		    if((myNumber % 2) != 0) {
		     myNumber++; 
		     }
		     else {
		     System.out.println(myNumber + " is even");
		     myNumber++;
		    }
		   }
	}
}
