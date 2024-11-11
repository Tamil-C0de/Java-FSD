import java.sql.*;
import java.util.Scanner;

public class CRUDApp {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "root";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connected to the DB");
			
			System.out.println("Do you want to create a new table?(yes/no)");
			String createTableOption = sc.nextLine();
			
			if (createTableOption.equalsIgnoreCase("yes")) {
				createTable(conn, sc);
			} 
			
			boolean exit = false;
			while(!exit) {
				System.out.println("\nChoose an option: ");
				System.out.println("1. Insert User");
				System.out.println("2. View User");
				System.out.println("3. Update User");
				System.out.println("4. Delete User");
				System.out.println("5. Exit");
				
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice) {
					case 1: insertUser(conn, sc); break;
					case 2: viewUser(conn); break;
					case 3: updateUser(conn, sc); break;
					case 4: deleteUser(conn, sc); break;
					case 5: exit = true; break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteUser(Connection conn, Scanner sc) {
		System.out.println("Enter user ID to delete: ");
		int id = sc.nextInt();
		
		String query = "DELETE FROM userdb WHERE id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			int rows = pstmt.executeUpdate();	
			
			System.out.println("Deleted " + rows + " row(s) from userdb table.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateUser(Connection conn, Scanner sc) {
		System.out.println("Enter user ID to update: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new name: ");
		String newName = sc.nextLine();
		
		System.out.println("Enter new age: ");
		int newAge = sc.nextInt();
		
		String query = "UPDATE userdb SET name = ?, age = ? WHERE id = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newName);
			pstmt.setInt(2, newAge);
			pstmt.setInt(3, id);
			int rows = pstmt.executeUpdate();	
			
			System.out.println("Updated " + rows + " row(s) in userdb table.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void viewUser(Connection conn) {
		String query = "SELECT * FROM userdb";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertUser(Connection conn, Scanner sc) {
		System.out.println("Enter user name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter user age: ");
		int age = sc.nextInt();
		
		String query = "INSERT INTO userdb(name, age) VALUES(?, ?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			int rows = pstmt.executeUpdate();	
			
			System.out.println("Inserted " + rows + " row(s) into userdb table.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createTable(Connection conn, Scanner sc) {
		System.out.println("Enter table name: ");
		String tableName = sc.nextLine();
		
		String createTableQuery = "CREATE TABLE " + tableName + " (" + 
		"id INT auto_increment primary key," + 
		"name varchar(100)," +
		"age int)";
		
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(createTableQuery);
			
			System.out.println("Table " + tableName + " created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}









