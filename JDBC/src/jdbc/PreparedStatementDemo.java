package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		String str = "insert into user values(?, ?)";
		PreparedStatement pst = con.prepareStatement(str);

		Scanner sc = new Scanner(System.in);
		pst.execute("truncate table user");
		System.out.println("Enter the number of rows you want to insert: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the username for row " + (i + 1));
			String username = sc.next();
			System.out.println("Enter the password for row " + (i + 1));
			String password = sc.next();
			pst.setString(1, username);
			pst.setString(2, password);
			// System.out.println(pst.execute());
		}

		String selectstr = "select * from user";
		ResultSet rs = pst.executeQuery(selectstr);
		while (rs.next()) {
			System.out.println(rs.getString(1) + "  " + rs.getString(2));
		}

		System.out.println(pst.execute(selectstr));

	}
}
