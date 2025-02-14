package session21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TestDBQuery {

    // Replace with your database name
    String url
        = "jdbc:mysql://localhost:3306/devschema";

    // Replace with your MySQL username
    String username = "devuser";

    // Replace with your MySQL password
    String password = "Mysql#123";
    
	public static void main(String[] args) {
		
		TestDBQuery testDBQuery = new TestDBQuery();
		Connection connection = testDBQuery.getDBConnection();
		Statement stmt = testDBQuery.getStmt(connection);
		
		testDBQuery.getStudentData(stmt);

		testDBQuery.updateStudentData(stmt);
		
		testDBQuery.deleteStudentData(stmt);
		
		testDBQuery.testJDBCTransaction(connection, stmt);
		
		testDBQuery.testJDBCSavePoint(connection, stmt);
	}

	/*
	 * test JDBC Transaction Savepoint functionality
	 */
	private void testJDBCSavePoint(Connection connection, Statement stmt) {
		System.out.println("Inside testJDBCSavePoint() ...");
		Savepoint savepoint1 = null;
		Savepoint savepoint2 = null;
		
		try{
			   //Assume a valid connection object conn
			connection.setAutoCommit(false);
			
		   //set a Savepoint
			savepoint1 = connection.setSavepoint("Savepoint1");
			
			String deleteSql = "Delete from pious_student " +
		            "WHERE ID = 105";
		         stmt.executeUpdate(deleteSql);
		         
		   stmt.executeUpdate(deleteSql);  
		   System.out.println("testJDBCSavePoint(): delete done succesfully....");
		   // throw new SQLException("Throw exception for testing purposes");
		   
		   //Submit a malformed SQL statement that breaks
		   // use a wrong table name to induce exception...
		   String updateSql = "UPDATE pious_student1 " +
	 	            "SET NSS = true WHERE ID = 100 ";
	 	   stmt.executeUpdate(updateSql);
	 	  System.out.println("testJDBCSavePoint(): update done succesfully....");      
	 	         
		   // If there is no error, commit the changes.
		   connection.commit();

		}catch(SQLException se){
		   // If there is any error.
			try {
				System.out.println("testJDBCSavePoint(): SQLException caught, roll back to savepoint1");
				connection.rollback(savepoint1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		getStudentData(stmt);
	} // End of testJDBCSavePoint()

	private void testJDBCTransaction(Connection connection, Statement stmt) {
		
		try {
			
			// set Auto Commit to false to start a transaction.
			connection.setAutoCommit(false);
			
			// (1) execute delete statement
			String deleteSql = "Delete from pious_student " +
		            "WHERE ID = 104";
		         stmt.executeUpdate(deleteSql);
			// (2) execute update statement
	         String updateSql = "UPDATE pious_student " +
	 	            "SET NSS = true WHERE ID in (100, 101, 102, 104)";
	 	         stmt.executeUpdate(updateSql);
			
			// Commit the changes.
			connection.commit( );
			
		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			/*try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}// testJDBCTransaction		
	}

	private void deleteStudentData(Statement stmt) {
		try{		      
	         String sql = "Delete from pious_student " +
	            "WHERE ID = 104";
	         stmt.executeUpdate(sql);
	         System.out.println("Printing updated data after deleting a record!");
	         
	         // After update, print all records again to see the updates..!
	         getStudentData(stmt);
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	}

	private void updateStudentData(Statement stmt) {
		// https://www.tutorialspoint.com/jdbc/jdbc-update-records.htm
		try{		      
	         String sql = "UPDATE pious_student " +
	            "SET NSS = true WHERE ID in (100, 101, 102, 104)";
	         stmt.executeUpdate(sql);
	         System.out.println("Printing updated data !");
	         
	         // After update, print all records again to see the updates..!
	         getStudentData(stmt);
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	}

	private void getStudentData(Statement stmt) {
		
		String selectQuery = "select * from pious_student";
		ResultSet rs = null;
		
		try {
			rs = stmt.executeQuery(selectQuery);
			
			 while(rs.next()){
	            //Display values
	            System.out.print("ID: " + rs.getInt("ID"));
	            System.out.print(", NAME: " + rs.getString("NAME"));
	            System.out.print(", ROLL_NO: " + rs.getInt("ROLL_NO"));
	            System.out.print(", DEPT: " + rs.getString("DEPT"));
	            
	            System.out.print(", NSS: " + rs.getBoolean("NSS"));
	            System.out.print(", NCC: " + rs.getBoolean("NCC"));
	            System.out.print(", SCHOLRSHIP: " + rs.getBoolean("SCHOLRSHIP"));
	            System.out.println(", SPORTS: " + rs.getBoolean("SPORTS"));
	         }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // End of getStudentData()

	/*
	 * Create JDBC Statement
	 */
	private Statement getStmt(Connection connection) {
		Statement stmt = null;
		// Create a statement
        try {
        	stmt = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}

	/*
	 * Create JDBC Connection
	 */
	public Connection getDBConnection(){ 
		Connection connection = null;
        // Establish JDBC Connection
        try {
          
            // Load Type-4 Driver
            // MySQL Type-4 driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(
                url, username, password);
        }
        catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: "
                               + e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("SQL Error: "
                               + e.getMessage());
        }
        return connection;
	}
}