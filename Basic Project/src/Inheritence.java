public  class Inheritence {
	public void c1() {
		System.out.println("this is the parent class method");    
		
	}
}

class In2 extends Inheritence
{
//private Object c1();
public void c1() {
	System.out.println("this is the child class method");
}
public static void main(String[] args) {
	In2 i= new In2();
	i.c1();
	
}

}