package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSetDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = st.executeQuery("select * from Person");
//		while (rs.next()) {
//			System.out.println(rs.getInt(1));
//		}
//
//		while (rs.previous()) {
//			System.out.println(rs.getInt(1));
//		}

		rs.absolute(10);
	}
}
