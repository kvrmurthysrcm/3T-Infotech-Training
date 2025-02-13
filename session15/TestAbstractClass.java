package session15;

/*
1) An instance of an abstract class can not be created.
2) Constructors are allowed.
3) We can have an abstract class without any abstract method.
	In Java, we can have an abstract class without any abstract method. 
	This allows us to create classes that cannot be instantiated but can only be inherited. 
	It is as shown below as follows with help of a clean java program.
4) There can be a final method in abstract class but any abstract method in class(abstract class) 
	can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an 
	error: “Illegal combination of modifiers: abstract and final”
5) We can define static methods in an abstract class
6) We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
7) If a class contains at least one abstract method then compulsory should declare a class as abstract 
8) If the Child class is unable to provide implementation to all abstract methods of the Parent class 
then we should declare that Child class as abstract so that the next level Child class should provide 
implementation to the remaining abstract method
 */

//Base class
class TestAbstractClass {
	
	 public static void main(String args[])
	 {
	     Sunstar s = new Employee();
	     s.printInfo();
	 }
 
}