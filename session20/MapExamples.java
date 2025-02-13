package session20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

    public static void main(String[] args) 
  {
    
      // Create a Map using HashMap
      Map<String, Integer> map = new HashMap<>();
      System.out.println("Map elements after creating: " + map);
      // Inserting pairs in above Map
      // using put() method
      map.put("a", new Integer(100));
      map.put("b", new Integer(200));
      map.put("c", new Integer(300));
      map.put("d", new Integer(400));
      
      // Displaying the Map
      System.out.println("Map elements after putting some key-value pairs: " + map);
      
      // Traversing through Map using for-each loop
      for (Map.Entry<String, Integer> me :
    	  map.entrySet()) {

          // Printing keys
          System.out.print(me.getKey() + ":");
          System.out.println(me.getValue());
      }
      
      testLinkedHashMap();
      
      testTreeMap();
      
      testOccurenceCountHashMap();
      
  } // end of main()
    
    public static void testOccurenceCountHashMap() {
        int dataArray[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2, 3, 3, 3 };

        // put all elements in arraylist
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < dataArray.length; i++) {
        	arrayList.add(dataArray[i]);
        }

        HashMap<Integer, Integer> hashMap = new HashMap();

        // counting occurrence of numbers
        for (int i = 0; i < arrayList.size(); i++) {
        	
        	hashMap.putIfAbsent(arrayList.get(i), Collections.frequency(
            		arrayList, arrayList.get(i)));
        }
        System.out.println("hashMap = " + hashMap);
    	
    }
    
    
    public static void testLinkedHashMap() {
    	// Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting pair entries in above Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
    
    /*
     * The TreeMap in Java is a concrete implementation of the java.util.SortedMap interface. 
     * It provides an ordered collection of key-value pairs, where the keys are ordered based on their natural order or a 
     * custom Comparator passed to the constructor.
     * 
     */
    public static void testTreeMap() {
    	// Creating an empty TreeMap
        Map<String, Integer> map = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        map.put("vishal-1", 10);
        map.put("sachin-1", 30);
        map.put("vaibhav-1", 20);
        map.put("blah-1", 20);
        
        System.out.println("Map after creation: " + map);
        
        map.put("sachin-1", 300); // update and add both use the same syntax:
        map.remove("blah-1");
        System.out.println("Map after updation: " + map);
        
        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());
    }
    
}
