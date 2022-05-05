 public class Employee{
	private int Eid;
	private String Ename;
	private String Email;

	public Employee(int eid, String ename, String email, int eage, int esal) {
		Eid = eid;
		Ename = ename;
		Email = email;
		Eage = eage;
		Esal = esal;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	private int Eage;
	private int Esal;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEage() {
		return Eage;
	}
	public void setEage(int eage) {
		Eage = eage;
	}
	public int getEsal() {
		return Esal;
	}
	public void setEsal(int esal) {
		Esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Email=" + Email + ", Eage=" + Eage + ", Esal=" + Esal
				+ "]";
	}
}
