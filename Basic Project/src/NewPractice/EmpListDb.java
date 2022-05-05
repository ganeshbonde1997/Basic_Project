package NewPractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

public class EmpListDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int eid;
		String name;
		String mail;
		float salary;

		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee(1, "Anant", "anant@gmail.com", 12500));
		elist.add(new Employee(4, "Vaibhav", "vaibhav@gmail.com", 10000));
		elist.add(new Employee(1, "Dharam", "dharam@gmail.com", 13800));
		elist.add(new Employee(12, "Hemant", "hemant@gmail.com", 11500));
		elist.add(new Employee(1, "Tushar", "tushar@gmail.com", 12500));

		Connection con = DriverManager.getConnection("jdbc:mysql:///test", "root", "root");
		java.sql.Statement st = con.createStatement();//  statement execute the query in database

		for (Employee e : elist) {
			eid = e.getEid();
			name = e.getName();
			mail = e.getMail();
			salary = e.getSalary();
 
			st.addBatch("INSERT INTO EMP (ID,NAME,MAIL,SALARY) VALUES(" + eid + ",'" + name + "','" + mail + "',"
					+ salary + ")");
		}
		int[] store = st.executeBatch();

		if (store.length > 0) {
			System.out.println("Record Inserted");
		}

	}
		
	}
	
	


