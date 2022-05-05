import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("The entered number is positive");
        }
        else{
            System.out.println("The entered number is negative");
        }
        }
    }
