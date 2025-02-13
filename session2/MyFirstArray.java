package session2;

/*
 * Arrays are fundamental structures in Java that allow us to store multiple values of the same type in a single variable. 
 * They are useful for storing and managing collections of data. Arrays in Java are objects, which makes them work differently
 *  from arrays in C/C++ in terms of memory management.

For primitive arrays, elements are stored in a contiguous memory location. For non-primitive arrays, references are stored 
at contiguous locations, but the actual objects may be at different locations in memory.

 */
public class MyFirstArray {

	 public static void main(String[] args)
	    {

	        // initializing array
	        int[] arr = { 1, 2, 3, 4, 5 };

	        // size of array
	        int n = arr.length;

	        // traversing array
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + ", ");
	    }

}
