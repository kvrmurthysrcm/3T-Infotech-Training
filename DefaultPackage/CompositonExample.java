/**
 * 
 */

/**
 * @author Admin
 *
 */
public class CompositonExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating a Company object
		Company techCompany =	new	Company	("Tech Corp");
		
		techCompany.addDepartment(new Department("Engineering"));
		techCompany.addDepartment(new	Department(	"Operations"));
		techCompany.addDepartment(new Department("Human Resources"));
		techCompany.addDepartment(new Department("Finance"));
		
		int d = techCompany.getTotalDepartments	();
		System.out.println(	"Total Departments: " +	d );
		
		System.out.println(	"\"Department name: "  );
		
		for(Department dept : techCompany.getDepartments()) {
			System.out.println(	"Department name: " +	dept.getDepartmentName() );
		}
		

	}

}
