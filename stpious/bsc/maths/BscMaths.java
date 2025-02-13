package stpious.bsc.maths;

import stpious.bsc.Bsc;

/**
 * 	static
	final
	abstract
	synchronized
	transient
	volatile
	native

 * @author Admin
 *
 */
public class BscMaths extends Bsc {
	
	// int i = 10;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	final int j = 20;
	
	public int m = 100;
	public int n = 101; 
	
	public String DEPT_ID = "Maths";
	
	public String getDeptName() {
		return "Mathematics";
	}
}
