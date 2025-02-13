package session13;

import java.util.ArrayList;
import java.util.List;

public class Bsc {
	
	public int i = 10;
	int k = 100;
	protected int j = 1000;
	private int l = 1005;
	
	private int classStrength = 30;
	private boolean acceptNCC = true;

	static final String fname = "PIOUS";
	
	static final String mname = null;
	
	public static void main(String[] args) {
		
		Bsc bsc = new Bsc(30);
		
		System.out.println("Bsc: i = " +  bsc.i ); // using super key word
		System.out.println("Bsc: j = " +  bsc.j ); // using inheritance
		
	}

 
	public Bsc(int classStrength, boolean acceptNCC) {
		this.classStrength = classStrength;
		this.acceptNCC = acceptNCC;
	}

	public Bsc() {
		System.out.println("Bsc object created: default constructer");
	}

	public Bsc(int classStrength) {
		this.classStrength = classStrength;
		System.out.println("Bsc object created: classStrength = " + classStrength);
	}
	
	public Bsc(boolean acceptNCC) {
		this.acceptNCC = acceptNCC;
		System.out.println("Bsc object created: acceptNCC = " + acceptNCC);
	}
	
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	// public access modifier
	public List getBranches() {
		List branches = new ArrayList<>();
		branches.add("Compuers");
		branches.add("Mathematics");
		branches.add("Physics");
		return branches;
	}
	
	// Default access
	List getBscBranches() {
		List branches = new ArrayList<>();
		branches.add("Compuers");
		branches.add("Mathematics");
		branches.add("Physics");
		return branches;
	}

	public String testmesg() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean hasCompLab() {
		return true;
	}
	
}