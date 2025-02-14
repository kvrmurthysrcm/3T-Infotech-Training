package session21;


	// Java program to implement a simple JDBC application
	import java.sql.*;

	public class TestJDBCApplication {
	    public static void main(String[] args)
	    {
	        // Database URL, username, and password

	        // Replace with your database name
	        String url
	            = "jdbc:mysql://localhost:3306/devschema";

	        // Replace with your MySQL username
	        String username = "devuser";

	        // Replace with your MySQL password
	        String password = "Mysql#123";

	        // Updated query syntax for modern databases
	        String query
	            = "INSERT INTO pious_student (ID, NAME, ROLL_NO, DEPT) VALUES (107, 'alia', 7, 'BSC_COMP' )";

	        // Establish JDBC Connection
	        try {
	          
	            // Load Type-4 Driver
	            // MySQL Type-4 driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish connection
	            Connection c = DriverManager.getConnection(
	                url, username, password);

	            // Create a statement
	            Statement st = c.createStatement();

	            // Execute the query
	            int count = st.executeUpdate(query);
	            System.out.println(
	                "Number of rows affected by this query: "
	                + count);

	            // Close the connection
	            st.close();
	            c.close();
	            System.out.println("Connection closed.");
	        }
	        catch (ClassNotFoundException e) {
	            System.err.println("JDBC Driver not found: "
	                               + e.getMessage());
	        }
	        catch (SQLException e) {
	            System.err.println("SQL Error: "
	                               + e.getMessage());
	        }
	    }
	}
