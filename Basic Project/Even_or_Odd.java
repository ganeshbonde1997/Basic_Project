import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        //Scanner class for taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        //condition for checking the even or odd

        if((a%2)==0){
            System.out.println("The Entered Number is Even Number");
        }
        else if((a%2)==1){
            System.out.println("Entered Number is Odd number");
        }
    }
}
