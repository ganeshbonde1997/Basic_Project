package NewPractice;
import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEid()==o2.getEid()) 
		{
		return 0;
		}
		else if (o1.getEid()>o2.getEid()) 
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
}
