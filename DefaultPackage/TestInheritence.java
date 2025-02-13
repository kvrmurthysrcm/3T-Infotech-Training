import stpious.bsc.Bsc;
import stpious.bsc.comp.BscComp;
import stpious.bsc.maths.BscMaths;

public class TestInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bsc bsc = new Bsc();
		
		BscComp bscComp = new BscComp();
		
		BscMaths bscMaths = new BscMaths();
		
		System.out.println("bsc: i = " + bsc.i);
		System.out.println("bsc: branches=" + bsc.getBranches());
		// System.out.println("**************** -- ****************** " );
		
		System.out.println("bscComp: i = " + bscComp.i); // from Bsc class // inherited instance variable
		System.out.println("bscComp: dept name = " + bscComp.getDeptName());
		System.out.println("bscComp:branches =  " + bscComp.getBranches()); // from Bsc class
		//System.out.println("**************** -- ****************** " );	
		
		// System.out.println("bscMaths: i = " + bscMaths.i); // from Bsc class
		System.out.println("bscMaths: getI = " + bscMaths.getI()); // from bscMaths class
		System.out.println("bscMaths: dept name = " + bscMaths.getDeptName());
		System.out.println("bscMaths: branches =  " + bscMaths.getBranches()); // from Bsc class
		
		System.out.println("bscMaths: m = " + bscMaths.m);
		System.out.println("bscMaths: n = " + bscMaths.n);
		
		// System.out.println("**************** -- ****************** " );	
		
		
	}

}
