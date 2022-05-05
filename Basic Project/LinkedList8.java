import java.util.LinkedList;

public class LinkedList8 {
    public static void main(String[] args) {
        LinkedList<String> Student = new LinkedList<String>();
        Student.add("Kunal");
        Student.add("Sahil");
        Student.add("Swapnil");
        Student.add("Ajay");
        Student.add("Sanjay");
        System.out.println("Original Linked List : " +Student);
        Object first_element = Student.getFirst();
        System.out.println("The first element of the Linked List :" + first_element);
        Object last_element = Student.getLast();
        System.out.println("The Last element of the linked List : " + last_element);
    }
}
