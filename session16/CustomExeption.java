package session16;

public class CustomExeption extends Exception{

	public CustomExeption(String exceptionMsg) {
		super(exceptionMsg);
		System.out.println(exceptionMsg);
	}

}
