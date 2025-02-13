import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Company {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private String companyName;
	private	List<Department> departments;
	
	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	// Constructor of Company class
	public	Company(String	companyName)
	{
		this.companyName =	companyName;
		this.departments =	new	ArrayList	<Department>();
	}
	
	// Method
	// to get total number of Departments in the Company
	public int getTotalDepartments()
	{
		return departments.size();
	}

	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		departments.add(department);
	}
	
}