package NewPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///Test","root","root");
		PreparedStatement ps=con.prepareStatement("insert into employee (id,name) values(?,?)");
		ps.setInt(1, 10);
		ps.setString(2,"Kunal");
		//ps.setInt(3,15000);
		int result = ps.executeUpdate();
		if(result>0) {
			System.out.println("Record is Inserted");
		}
		else {
			System.out.println("Record is not inserted");
		}
	}

}
