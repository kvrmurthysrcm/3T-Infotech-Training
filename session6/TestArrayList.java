package session6;

import java.util.ArrayList;

/*
 * ArrayList inherits AbstractList class and implements the List interface.
ArrayList is initialized by size. However, the size is increased automatically if the collection grows or shrinks 
if the objects are removed from the collection.
Java ArrayList allows us to randomly access the list.
ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
ArrayList in Java can be seen as a vector in C++.
ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.

 */
public class TestArrayList {

    public static void main (String[] args) {
        
          // Creating an ArrayList
          ArrayList<Integer> a = new ArrayList<Integer>();
          
          // Adding Element in ArrayList
          a.add(1);
          a.add(2);
          a.add(3);
      
          // Printing ArrayList
          System.out.println("ArrayList: " +a);
          
          // Removing Element using the value
          a.remove(2);
          
          // Updating value at index 0
          a.set(0, 10);
          
       // Printing ArrayList
          System.out.println("ArrayList after modifications: " + a);
          
          a.clear();
       // Printing ArrayList
          System.out.println("ArrayList after clearing it: " + a);
          
       // Adding Element in ArrayList
          a.add(1);
          a.add(2);
          a.add(3);
          // Printing ArrayList
          System.out.println("ArrayList after modifications: " + a);
          
          System.out.println("ArrayList contains value 2: " + a.contains(2));
          
          System.out.println("ArrayList value of object at index 1: " + a.get(1));
          
          System.out.println("ArrayList to Array: " + a.toArray());
          
          ArrayList<Integer> l1 = new ArrayList<>();
          l1.add(10);
          l1.add(20);
          
          a.addAll(l1);
       // Printing ArrayList
          System.out.println("ArrayList after addAll: " + a);
          
          
          
    }
}
