import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConn1 {
	public static void main(String[] args)throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql:///Test","root","root");
		PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE(id,name) values(?,?)");
		ps.setInt(1,8);
		ps.setString(2,"Xyz");
		int result =ps.executeUpdate();
		if (result>0) {
			System.out.println("Record Inserted");
		}
		else {
			System.out.println("Record Not Inserted");
	}
	}

}
