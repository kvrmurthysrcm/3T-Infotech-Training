package session15;

import java.util.Comparator;

//Helper class implementing Comparator interface
class SortbyRoll implements Comparator<Student> 
{    
   // Compare by roll number in ascending order
 public int compare(Student a, Student b) {
	 System.out.println("a.rollno: " + a.rollno + ", b.rollno: " + b.rollno + " :: diff: " + (a.rollno - b.rollno) );
     return a.rollno - b.rollno;
 }
}
