import java.util.Comparator;

public class EmpID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEid() == o2.getEid()) {
			return 0;
		} else if (o1.getEid() > o2.getEid()) {
			return 1;
		} else {
			return -1;
		}
	}

	/*
	 * @Override public int compare(Object o1, Object o2) { Employee e1 =
	 * (Employee)o1; Employee e2 = (Employee)o2; if (e1.getEid()==e2.getEid()) {
	 * return 0; } if(e1.getEid()>e2.getEid()){ return 1; } else { return -1; } }
	 */

}
