import java.util.LinkedList;
//Adding the element in the Linked List at 2nd position
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> MI = new LinkedList<String>();
        MI.add("Rohit");
        MI.add("Ishan");
        MI.add("Surya");
        MI.add("Pollard");
        MI.add("Dewald");
        MI.add("Bumrah");
        System.out.println("Before adding the another player in the list : " + MI);

        MI.add(2, "Jay");
        System.out.println("after adding the player in the list : " + MI);

    }
}
