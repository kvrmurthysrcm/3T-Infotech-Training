package session15;

//Using Comparator Interface
import java.util.*;

//Define the Student class
class Student {
	
 int rollno;
 String name;

   // Constructor
 Student(int rollno, String name) {
     this.rollno = rollno;
     this.name = name;
 }

   // Method to print Student
   // details in main()
 @Override
 public String toString() {
     return rollno + ": " + name;
 }
 
}