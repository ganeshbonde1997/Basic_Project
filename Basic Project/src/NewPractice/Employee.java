package NewPractice;

public class Employee {
	private Integer eid;
	private String name;
	private String mail;
	private int Salary;
	public Employee(Integer eid, String name, String mail, int salary) {
		this.eid = eid;
		this.name = name;
		this.mail = mail;
		Salary = salary;
	}
	public Integer setEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", mail=" + mail + ", Salary=" + Salary + "]";
	}

	public Integer getEid() {
		// TODO Auto-generated method stub
		return eid;
	}
}
