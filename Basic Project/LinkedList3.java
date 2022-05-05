import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<String>();
        List.add("Hrithik");
        List.add("Salaman");
        List.add("Sharukh");
        List.add("Sanjay");
        List.add("Dhoni");
        System.out.println("Before reversing the List :" + List);

        Iterator i = List.descendingIterator();
        while (i.hasNext()){
            System.out.println("After reversing the List");
            System.out.println(i.next());
        }
    }
}
