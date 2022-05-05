import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DbConn4 {
	public static void main(String[] args) throws SQLException {
		Scanner sc= new Scanner(System.in);
		Connection con =DriverManager.getConnection("jdbc:mysql:///Test","root","root");
		PreparedStatement ps =con.prepareStatement("INSERT INTO movies(title,Akka,speciality,Handling_power)values(?,?,?,?)");
		System.out.println("How many Akka's you want");
		int rec=sc.nextInt();
		for (int i=1;i<=rec;i++)
		{
		
		System.out.println("Enter the Name for the title");
		String str1=sc.next();
		System.out.println("Enter Akka's name");
		String str2=sc.next();
		System.out.println("Enter Speciality");
		String str3=sc.next();
		System.out.println("Enter the Handling power");
		int str4=sc.nextInt();
		
		
		ps.setString(1, str1);
		ps.setString(2,str2);
		ps.setString(3, str3);
		ps.setInt(4, str4);
		int result=ps.executeUpdate();
		
		
		if (result>0) {
			System.out.println("Record inserted ");
		}
		else 
		{
			System.out.println("Record not inserted");
		}
		}
	}
		
}
