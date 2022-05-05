import java.util.Comparator;

public class EmpSA implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEsal() == o2.getEsal()) {
			return 0;
		} else if (o1.getEsal() < o2.getEsal()) {
			return -1;
		} else {
			return 1;
		}
	}

}
