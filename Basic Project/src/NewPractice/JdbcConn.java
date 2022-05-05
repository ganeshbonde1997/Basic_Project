package NewPractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JdbcConn {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id=sc.nextInt();
		
		System.out.println("Enter the Name");
		 String name=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// we can load it or it is not mandotary 
			Connection con = DriverManager.getConnection("jdbc:mysql:///Test", "root", "root");
			PreparedStatement ps = con.prepareStatement("Insert into Employee (id, name)values (?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("Record Is inserted into the Table");
			}
			else 
			{
				System.out.println("Record is Not Inserted");
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
