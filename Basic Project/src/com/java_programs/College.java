package com.java_programs;

public class College {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setAdd("A'bad");
		s1.setId(5);
		s1.setName("ganesh");
		System.out.println("Id:"+s1.getId()+"  " +"Name:"+ s1.getName()+ "   "+ "Address"+ s1.getAdd());
		Faculty f1=new Faculty();
		f1.setId(1);
		f1.setName("Satish Sir");
		f1.setAdd("Aurangabad");
		f1.setSubject("Linux operating System");
		System.out.println("Id:" + f1.getId() +"    "+ "Name: " + f1.getName() +"     "+ "Subject: "+ f1.getSubject() +"      "+ "Address:" + f1.getAdd() );
		Hostel h=new Hostel();
		h.setAge(19);
		h.setGame("Volleyball");
		h.setName("Ganesh");
		h.setId(2);
		System.out.println("Id:"+ h.getId()+"  "+"Name:"+h.getName()+"  "+"Game:"+h.getGame()+"  "+"Age:"+"  "+h.getAge() );
	}
}
