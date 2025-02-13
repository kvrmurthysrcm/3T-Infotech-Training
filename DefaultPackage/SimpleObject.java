import session8.StaticMethodExample;

public class SimpleObject {
	
	int age = 21;
	String name = "John Doe!";
	
	public static void main(String[] args) {
		
		SimpleObject so = new SimpleObject(30, "John Deer");
		so.getAge();
		so.getName();
	}

	public SimpleObject() {
	}

	
	public SimpleObject(int age, String name) {
		this.age = age;
		this.name = name;
		// this.age =StaticMethodExample.getAge();
		
	}
	
	public int getAge() {
		
		System.out.println("StaticMethodExample.age = " + StaticMethodExample.getAge());
		System.out.println("age = " + age);
		return age;
	}
	
	public String getName() {
		
		System.out.println("StaticMethodExample.name = " + StaticMethodExample.getName());
		System.out.println("name = " + name);
		return name;
	}
	
}