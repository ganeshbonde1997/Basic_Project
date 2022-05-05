import java.util.Scanner;

public class Pass_or_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks ");
        int marks = sc.nextInt();
        if(marks>30){
            System.out.println("You are passed in the exam");
        }
        else {
            System.out.println("you are failed in exam");

        }
    }
}
