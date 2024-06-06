package databasecreate;
import java.sql.*;


public class Data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		        try {
		            // Load the MySQL JDBC driver


		            Class.forName("com.mysql.cj.jdbc.Driver");
		            
		            // Create a connection to the database


		            String url = "jdbc:mysql://localhost:3306/";

		            String username = "root";
		            String password = "";

		            Connection connection = DriverManager.getConnection(url, username, password);
		            
		            // Create a statement
		            Statement statement = connection.createStatement();
		            
		            // Create a new database named "fsd"
		            
		            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS fsd";
		            statement.executeUpdate(createDatabaseSQL);
		            System.out.println("Database 'fsd' created successfully");
		            
		            
	            
		            
	            
	/*	            
		            //show database
		            
		            
		            String showDatabasesSQL = "SHOW DATABASES";
		            ResultSet resultSet1 = statement.executeQuery(showDatabasesSQL);
		            System.out.println("List of databases:");
		            while (resultSet1.next()) {
		                System.out.println(resultSet1.getString(1));
		            }
		            
		            
		            
	*/	            
		            
		            
		            
		            // Connect to the new database
		            
		            
		            url = "jdbc:mysql://localhost:3306/fsd";
		            connection = DriverManager.getConnection(url, username, password);
		            statement = connection.createStatement();
		            
		            // Create a new table named "trainee" in the "fsd" database
		            String createTableSQL = "CREATE TABLE IF NOT EXISTS trainee (name VARCHAR(255) NOT NULL,mobile INT NOT NULL,mail VARCHAR(255) NOT NULL,PRIMARY KEY (mail))";
		            statement.executeUpdate(createTableSQL);
		            System.out.println("Table 'trainee' created successfully ");
		            
		            
		           
    
		       // Insert sample data into the "trainee" table
		            
		           
		            String insertDataSQL = "INSERT INTO trainee (name, mobile , mail) VALUES('Ramakant prajapati', 789709770, 'ramakantprajapati12@gmail.com'), ('Sanju', 789456123, 'sanju1@gmail.com')";
		
		            statement.executeUpdate(insertDataSQL);
		            System.out.println("Sample data inserted into 'trainee' table.");
		            
  
	   
		            
		            
/*
		            // Define the ID of the trainee to be retrieved
		            
		            String traineeMail = "ramakantprajapati11@gmail.com"; // Change this to the email you want to retrieve
		            
		            // Query to retrieve data for a specific student based on email
		            String query = "SELECT * FROM trainee WHERE mail = '" + traineeMail + "'";
		            ResultSet resultSet = statement.executeQuery(query);
		            
		            // Check if the ResultSet has a row and print the data
		            if (resultSet.next()) {
		                String mail = resultSet.getString("mail");
		               
		                String name = resultSet.getString("name");
		                int mobile = resultSet.getInt("mobile");
		                
		                System.out.println("Name: " + name + ", Mobile: " + mobile + ", Mail: " + mail);
		               
		            } else {
		                System.out.println("No student found with email: " + traineeMail);
		            }
           
*/

		            
		         // Query and display data from the "trainee" table
		            
		            
		            
		            
		            String showTableDataSQL = "SELECT * FROM trainee";
		            ResultSet resultSet = statement.executeQuery(showTableDataSQL);
		            System.out.println("Data in 'trainee' table:");
		            
		            while (resultSet.next()) {
		                
		                //int id = resultSet.getInt("id");
		                String name = resultSet.getString("name");
		                int mobile = resultSet.getInt("mobile");
		                String mail = resultSet.getString("mail");
		                
		                System.out.println("Name: " + name );  
		                System.out.println("Mobile: "+ mobile);
		                System.out.println("Mail: " + mail);
		                System.out.println("===========================================");
		            }
		            
            
		            
		            
		            
		            // Update data in the "trainee" table
		            

		            
		            String updateDataSQL = "UPDATE trainee SET name = 'aman pal' WHERE mail = 'aman@gmail.com'";
		            statement.executeUpdate(updateDataSQL);
		            System.out.println("Updated data in 'trainee'.");




		            // Query and display data from the "trainee" table after update

		            resultSet = statement.executeQuery(showTableDataSQL);
		            System.out.println("Data in 'trainee' table after update:");
		            while (resultSet.next()) {
		                   
		               
		                String name = resultSet.getString("name");
		                int mobile = resultSet.getInt("mobile");
		                String mail = resultSet.getString("mail");
		                
		                System.out.println("Name: " + name );  
		                System.out.println("Mobile: "+ mobile);
		                System.out.println("Mail: " + mail);
		                System.out.println("===========================================");
		            }
		            
		            
	            
		            
		            // Delete data from the "trainee" table where age is greater than 21
	/*	            
		            String deleteDataSQL = "DELETE FROM trainee WHERE name ='aman pal'";
		            statement.executeUpdate(deleteDataSQL);
		            System.out.println("Deleted data from 'trainee' table");
		           
		         
	*/	            
		            
		            
		              // Query and display data from the "trainee" table
	/*	            
		            String showTableDataSQL = "SELECT * FROM trainee";
		            ResultSet resultSet = statement.executeQuery(showTableDataSQL);
		            System.out.println("Data in 'trainee' table:");
		            
		            
		            
		            while (resultSet.next()) {
		                 
		                String name = resultSet.getString("name");
		                int mobile = resultSet.getInt("mobile");
		                String mail = resultSet.getString("mail");
		                
		                System.out.println("Name: " + name );  
		                System.out.println("Mobile: "+ mobile);
		                System.out.println("Mail: " + mail);
		                System.out.println("===========================================");
		            }
		            
	 */          
		            
		            
		            
		            // Close the statement and connection
		           // resultSet.close();
		           
		            
		            // Close the statement and connection
		            statement.close();
		            connection.close();
		        } catch (ClassNotFoundException e) {
		            System.out.println("MySQL JDBC driver not found.");
		            e.printStackTrace();
		        } catch (SQLException e) {
		            System.out.println("Database error.");
		            e.printStackTrace();
		        }
		    }
		

	}
	


