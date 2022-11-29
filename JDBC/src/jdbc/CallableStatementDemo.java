package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		CallableStatement cst = con.prepareCall("{call getFullNameByFirstName(?)}");

		cst.setString(1, "Geetika");
		cst.registerOutParameter(1, java.sql.Types.VARCHAR);
		cst.executeUpdate();
		String fullname = cst.getString(1);
		System.out.println("Full Name: " + fullname);
	}
}
