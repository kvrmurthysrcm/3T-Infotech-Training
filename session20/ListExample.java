package session20;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExample.example1();
		
		ListExample.example2();
		
		ListExample.example3();
	}

	public static void example1() {
		System.out.println("Example 1:");
		List<String> numbers = Arrays.asList("one", "two", "three");
		
		for (ListIterator<String> iterator = numbers.listIterator(); iterator.hasNext();) {
		    String nextElement = iterator.next();
		    if (Objects.equals(nextElement, "two")) {
		        iterator.set("2");
		    }
		}
		
		System.out.println("numbers = " + numbers);
	}
	
	public static void example2() {
		System.out.println("Example 2:");
		List<String> strings = Arrays.asList("0", "1", "2", "3", "4", "5");
		System.out.println(strings);
		// strings.subList(2, 5).clear();
		// strings.subList(2, 5);
		System.out.println(strings.subList(2, 5));
	}
	
	public static void example3() {
		System.out.println("Example 3:");
	}
}