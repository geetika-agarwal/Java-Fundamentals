package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = MyConnection.getConnection();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from person");
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("Column Count: " + rsmd.getColumnCount());
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.println(rsmd.getColumnLabel(i) + "\t" + rsmd.getColumnTypeName(i));
		}

		DatabaseMetaData dmd = con.getMetaData();
		System.out.println("Database Version: " + dmd.getDriverVersion());
		System.out.println("Major Database Version: " + dmd.getDatabaseMajorVersion());
		ResultSet rs1 = dmd.getCatalogs();
		while (rs1.next()) {
			System.out.println(rs1.getString(1));
		}
	}
}
