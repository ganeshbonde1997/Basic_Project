import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> L = new ArrayList<String>();
        System.out.println("Enter Lineups of Mumbai Indians");
        L.add("Ishan Kishan");
        L.add("Rohit Sharma");
        L.add("Suryakumar Yadav");
        L.add("Dewald Brevis");
        L.add("Tilak Verma");
        L.add("Danial Sams");
        L.add("Kieron Pollard");
        L.add("Jaydev Undakat");
        L.add("Jasprit Bumrah");
        L.add("Tymal Mills");
        L.add("Mayank Markande");
        System.out.println("before reversing the List"+L);


        Collections.sort(L);
        System.out.println("after reversing the List" + L);
    }
}
