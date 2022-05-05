import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDbs {
	public static void main(String[] args) throws SQLException {
		//ClassforName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql:///Test","root","root");
		PreparedStatement ps= con.prepareStatement("insert into persons(id,lastname,firstname,age) values(?,?,?,?)");
		ps.setInt(1,6);
		ps.setString(2,"D'suaza");
		ps.setString(3,"Archi");
		ps.setInt(4,16);
		
		int result=ps.executeUpdate();
		if (result>0) {
			System.out.println("Record Inserted");
		}
		else {
			System.out.println("Record not inserted");
		}
		
		
	}

}
