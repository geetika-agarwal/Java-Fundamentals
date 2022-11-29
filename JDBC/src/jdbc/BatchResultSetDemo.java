package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchResultSetDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into user values(?, ?)");

		con.setAutoCommit(false);
		pst.setString(1, "pqr");
		pst.setString(2, "pqr123");
		pst.addBatch();

		pst.setString(1, "rst");
		pst.setString(2, "rst123");
		pst.addBatch();

		pst.executeBatch();
		con.commit();
	}
}
