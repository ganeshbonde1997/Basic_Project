import java.util.LinkedList;
public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<String>();
        student.add("Kunal");
        student.add("Kiran");
        student.add("Sahil");
        student.add("Shubham");
        student.add("rohit");

        System.out.println(" Linkedlist : " +student);

        student.addFirst("Ajay");

        System.out.println("After adding the name in the first : " + student);

        student.addLast("Vijay");
        System.out.println("After adding the name in the last : " +student);

    }
}
