package NewPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchRecord {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql:///Test", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from Emp");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "   " + rs.getString(2)+
			"   "+ rs.getString(3)+"     "+rs.getFloat(4));
		}

		
	}

}
