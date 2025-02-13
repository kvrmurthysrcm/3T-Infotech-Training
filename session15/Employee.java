package session15;

//Abstraction performed using extends
class Employee extends Sunstar {
	
	public Employee() {
		System.out.println("Inside Employee: implemetation class constructor...");
	}
	
	// implementation of abstract method:
	 void printInfo()
	 {
	     String name = "avinash";
	     int age = 21;
	     float salary = 222.2F;
	
	     System.out.println(name);
	     System.out.println(age);
	     System.out.println(salary);
	 }
 
}