package java_jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExample {
 
    public static void main(String[] args) {
        // The credentials that we need to have available for the connection to the database.
        String username = "root";
        String password = "1234";
        String databaseName = "peopledb";
 
        Connection connect = null;
        Statement statement = null;
 
        try {
            // Load the MySQL driver. put my sql driver in class path (mysql-connector-java-8.0.30.jar)
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            // Setup the connection to the database
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + databaseName + "?"
                    + "user=" + username
                    + "&password=" + password);
 
            // Create the statement to be used to get the results.
            statement = connect.createStatement();
 
            // Create a query to use.
            String query = "SELECT * FROM users ORDER BY name";
 
            // Execute the query and get the result set, which contains
            // all the results returned from the database.
            ResultSet resultSet = statement.executeQuery(query);
 
            while (resultSet.next()) {
                System.out.println("Printing result...");
 
                // Now we can fetch the data by column name, save and use them!
                String name = resultSet.getString("name");
                String dob = resultSet.getString("birth");
                long id = resultSet.getLong("id");
 
                System.out.println("\tname: " + name + 
                        ", has dob: " + dob + 
                        ", of id: " + id);
            }
 
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
}
