import java.util.LinkedList;
//Adding the element in the first and last on LinkedList
public class LinkedList6 {
    public static void main(String[] args) {
        LinkedList<String> Student = new LinkedList<String>();
        Student.add("Kunal");
        Student.add("Sahil");
        Student.add("Swapnil");
        Student.add("Ajay");
        Student.add("Sanjay");

        System.out.println("Linked List : " +Student);
        Student.offerFirst("Yogesh");
        System.out.println("After adding the one Student first : " +Student);
        Student.offerLast("Vijay");
        System.out.println("After adding the one student in last : " +Student);


    }
}
