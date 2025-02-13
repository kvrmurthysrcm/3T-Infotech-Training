package session15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TestComparator {
	

    public static void main(String[] args) 
    {
          // List of Students
        List<Student> students = new ArrayList<>();
        
          // Add Elements in List
        students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));
        
        System.out.println("B4 sorting: ");
     // Iterating over entries to print them
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));

        // Sort students by roll number
        // using SortbyRoll comparator
        Collections.sort(students, new SortbyRoll());

        System.out.println("Sorted by Roll Number ");

        System.out.println("After sorting: ");
        // Iterating over entries to print them
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
        
        testTreeMapSort();
    }// end of main()
    
    public static void testTreeMapSort() {
    	 System.out.println("Inside testTreeMapSort(): ");
    	TreeMap<Student, Integer> tree_map
        = new TreeMap<Student, Integer>(
            new SortbyRoll()); // O(1)

    tree_map.put(new Student(1110, "bananas"),
                 2); // O(log n)
    tree_map.put(new Student(1310, "apples"),
                 3);
    tree_map.put(new Student(1210, "cats"),
                 1); 
    tree_map.put(new Student(12, "blah"),
            1); 

    System.out.println("TreeMap: " + tree_map); // its a sorted map...
    	
    }
}