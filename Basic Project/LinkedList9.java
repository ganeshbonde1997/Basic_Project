import java.util.LinkedList;
public class LinkedList9 {
    //Write a Java program to display the elements and their positions in a linked list.
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Yellow");
        color.add("Blue");
        color.add("Cyan");
        color.add("White");
        for(int i=0; i<color.size(); i++){
            System.out.println("Element at index " +i+" :"+color.get(i));
        }
    }
}
