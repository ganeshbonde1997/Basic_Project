import java.util.Collections;

//Sorting the Linked List and removing and one data

public class LinkedList<S> {
    public static void main(String[] args) {
        java.util.LinkedList<String> LL = new java.util.LinkedList<String>();
        LL.add("Rohit");
        LL.add("Ishan");
        LL.add("Surya");
        LL.add("Dewald");
        LL.add("Jasprit");
        LL.add("Jaydev");
        Collections.sort(LL);
        System.out.println(LL);
        LL.remove(1);
        System.out.println("After the removing the element "+LL);
    }
}
