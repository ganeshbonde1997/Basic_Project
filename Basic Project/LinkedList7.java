import java.util.LinkedList;
public class LinkedList7 {
    public static void main(String[] args) {
        LinkedList<String> Student = new LinkedList<String>();
        Student.add("Hrithik");
        Student.add("Ashish");
        Student.add("Sahil");
        System.out.println("This is the First list" +Student);

        LinkedList<String> Student2 = new LinkedList<String>();
        Student.add("Sanjay");
        Student.add("Yogesh");

        Student.addAll(2, Student2);
        System.out.println("After adding the all names in the list  :" + Student);

    }
}
