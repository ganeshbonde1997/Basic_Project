import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConn
{
	public static void main(String args[]) throws SQLException{
	//ClassForName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql:///Test","root","root");
	PreparedStatement ps = con.prepareStatement("insert into persons(id,lastname,firstname,age) values(?,?,?,?)");
	ps.setInt(1, 7);
	ps.setString(2,"Kapoor");
	ps.setString(3,"Shraddha");
	ps.setInt(4,16);
	int result =ps.executeUpdate();
	if (result>0) {
		System.out.println("Record Inserted Successfully");
	}
	else
	{
		System.out.println("Record Not Inserted");
	}
	}
}
