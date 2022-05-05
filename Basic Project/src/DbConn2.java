import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DbConn2 {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql:///Test","root","root");
		PreparedStatement ps =con.prepareStatement("INSERT INTO EMPLOYEE(id,name) values(?,?)");
		System.out.println("Enter the Id for the Record");
		int num=sc.nextInt();
		System.out.println("Enter the Name for the Record");
		String str=sc.next();
		ps.setInt(1, num);
		ps.setString(2, str);
		int result=ps.executeUpdate();
		if (result>0) {
			System.out.println("Record inserted successfully");
		}
		else {
			System.out.println("Record not inserted");
		}
	}
}
