package session13;

import stpious.bsc.comp.BscComp;

public class MySingleTon {
	
	public String fname = "test";
	
	static MySingleTon mySingleTon ;
	
	private MySingleTon() {
	
		System.out.println("MySingleTon instantiated...");
	}

	public static void main(String[] args) {
		
		MySingleTon mySingleTon = new MySingleTon();
		
		System.out.println("fname = " +  mySingleTon.fname ); // using super key word
		
	}
	
	public static MySingleTon getInstance() {
		if(mySingleTon == null)
			mySingleTon = new MySingleTon();
		
		return mySingleTon;
	}
}
