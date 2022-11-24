package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter database: ");
//		String database = sc.nextLine();
//		System.out.println("Enter database username:");
//		String username = sc.nextLine();
//		System.out.println("Enter Password: ");
//		String password = sc.nextLine();
		String url = "jdbc:mysql://localhost:3306/group1";
		Connection con = DriverManager.getConnection(url, "root", "root@123");
		return con;
	}
}
