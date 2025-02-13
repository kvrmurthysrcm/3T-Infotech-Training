package session13;

import stpious.bsc.Bsc;
import stpious.bsc.Project;
import stpious.bsc.TestInterface;

public class BscComp extends Bsc implements Project, TestInterface {
	
	int m = 100; // public instance variable
	int n = 101; // protected instance variable	
	
	String DEPT_ID = "COMP";
	
	public static void main(String[] args) {
		
		BscComp bscComp = new BscComp();
		
		System.out.println("Bsc: i = " +  bscComp.i ); // using super key word
		System.out.println("Bsc: j = " +  bscComp.j ); // using inheritance
		
	}

	/*
	 * 
	 */
	public String getDeptName() {
		return "Compuers";
	}

	@Override
	public String getProjectTitle() {
		// TODO Auto-generated method stub
		return "Test Project";
	}

	@Override
	public String testmesg() {
		// TODO Auto-generated method stub
		return "Test message implemented from TestInterface....";
	}
}