import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EmpMain {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(11, "Ganesh", "ganesh@gmail.com", 23, 26000));
		list.add(new Employee(24, "Anant", "anant@gmail.com", 18, 22000));
		list.add(new Employee(10, "Ananya", "ananya@gmail.com", 17, 24000));
		list.add(new Employee(8, "Purushottam", "purushottam@gmail.com", 22, 25000));
		list.add(new Employee(30, "Narendra", "narendra@gmail.com", 23, 28000));
		list.add(new Employee(15, "Anant", "anant@gmail.com", 29, 21000));
		list.add(new Employee(5, "Ashish", "ashish@gmail.com", 22, 22000));
		list.add(new Employee(35, "Aditya", "aditya@gmail.com", 21, 27000));

		System.out.println("After the Sorting order By Id");
		Collections.sort(list, new EmpID());
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("   ");
		System.out.println("After the sorting By salary");

		Collections.sort(list, new EmpSA());
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}


