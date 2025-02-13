package stpious.bsc;

import java.util.ArrayList;
import java.util.List;

public class Bsc {
	
	public int i = 10;
	int k = 100;
	protected int j = 1000;
	private int l = 1005;
	
	
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
	
	public void addTeacher(String tName) {
		
	}
	
	public void addTeacher(String tName, String subject) {
		
	}

}