
public class ToStringDemo {
	String name;
	int rollno;
	ToStringDemo (String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		ToStringDemo s1= new ToStringDemo("pushpa", 101);
		ToStringDemo s2= new ToStringDemo("Dhoni", 07);
		System.out.println(s1);
		//System.out.println(s1.toString());
		System.out.println(s2);
	}

}
