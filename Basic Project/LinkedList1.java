import java.util.LinkedList;
//wrap to iterate through list
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<>();
        LL.add("Venky");
        LL.add("Sam");
        LL.add("Shreyas");
        LL.add("Nitish");
        LL.add("Andre");
        LL.add("Sunil");
        LL.add("Pat");
        LL.add("Umesh");
        LL.add("Ajinkya");
        for(String elements: LL){
            System.out.println(elements);
        }

    }
}
