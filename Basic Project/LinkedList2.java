import java.util.Iterator;
import java.util.LinkedList;
//to print the next elemnt by using index
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<String>();
        LL.add("Hrithik");
        LL.add("Sharukh");
        LL.add("Sanjay");
        LL.add("Alia");
        LL.add("Deepika");
        LL.add("Salman");


        Iterator a = LL.listIterator(0);
        while (a.hasNext()){
            System.out.println(a.next());
        }


    }
}
