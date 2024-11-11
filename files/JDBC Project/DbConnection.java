import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";
		
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		String name = sc.nextLine();
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("Connected to the Database");
			Statement stmt = con.createStatement();
			
			
//			String query1 = "insert into employees values(3, 'VIjay')";
//			int res = stmt.executeUpdate(query1);
			
			String query1 = "INSERT INTO employees(id, name) VALUES(?, ?)";
			
			PreparedStatement pstmt = con.prepareStatement(query1);
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			
			int res = pstmt.executeUpdate();
			
			String query2 = "SELECT * FROM employees";
			ResultSet rs = stmt.executeQuery(query2);
			
			while(rs.next()) {				
				System.out.println("Employee ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 JDBC - Java Database Connectivity

Components
  java.sql

DriverManager
Connection
Statement subset -> PreparedStatement
ResultSet

JDBC Drivers -> 4 types
1. JDBC-ODBC(Open Database Connectivity) Bridge
2. Native-API
3. Network Protocol
4. Thin Driver

Database URL, username, password
localhost:3306 -> 127.0.0.1:3306
 */
