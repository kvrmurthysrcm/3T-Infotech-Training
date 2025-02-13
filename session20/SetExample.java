package session20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * The Set interface does not bring any new method to the Collection interface. 
 * The Collections Framework gives you one plain implementation of the Set interface: HashSet. 
 * Internally, a HashSet wraps an instance of HashMap, a class that will be covered later, that acts as a delegate for HashSet.

As you already saw, what a Set brings to a Collection is that it forbids duplicates. 
What you lose over the List interface is that your elements are stored in no particular order. 
There is very little chance that you will iterate over them in the same order as you added them to your set.

 */
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExample.example1();
		
		SetExample.example2();
		
		SetExample.example3();
		
	}
	public static void example1() {
		// List<String> strings = List.of("one", "two", "three", "four", "five", "six");
		List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six");
		Set<String> set = new HashSet<>();
		set.addAll(strings);
		set.forEach(System.out::println);
	}
	
	public static void example2() {
		SortedSet<String> strings = new TreeSet<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
		SortedSet<String> subSet = strings.subSet("a", "d");
		System.out.println("sub set = " + subSet);
	}
	
	public static void example3() {
		NavigableSet<String> sortedStrings = new TreeSet<>(Arrays.asList("a", "c", "b", "d", "e", "f"));
		System.out.println("sorted strings = " + sortedStrings);
		NavigableSet<String> reversedStrings = sortedStrings.descendingSet();
		System.out.println("reversed strings = " + reversedStrings);
	}
}
