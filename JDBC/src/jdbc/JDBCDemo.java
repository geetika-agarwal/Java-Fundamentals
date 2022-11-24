package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		System.out.println("Connection Established!!");

		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("select * from person");
//		while (rs.next()) {
//			System.out.print(rs.getInt(1) + " ");
//		}

//		String sqlInsert = "insert into person values (11, 'Alan',null, 'Smith', '2002-05-26');";
//		int rowsAffected = st.executeUpdate(sqlInsert);
//		if (rowsAffected > 0)
//			System.out.println("Row(s) inserted!!");
//		else
//			System.out.println("Row(s) didn't insert");

		try {
			String createSt = "create table user(username varchar(200), password varchar(200))";
			boolean status = st.execute(createSt);
			System.out.println(status);
		} catch (Exception e) {
			System.out.println("no table with that name exists...");
		}
	}
}
