package Array;

import java.util.Scanner;

public class ArrayExercise4 {
    public static void main(String[] args) {
        //Scanner class object to read input
        Scanner sc = new Scanner(System.in);

        //Delcaring and creating array objects
        int[]a = new int[5];

        //Displaying default values
        System.out.println("Default values of array:");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]+"\t");
        }
        //Initializing array
        System.out.println("\n\n***Intializing Array***");
        System.out.println("Enter" +a.length +" integer values:");

        for(int i=0; i<a.length; i++)
        {
            //read input
            a[i] = sc.nextInt();
        }
        System.out.println("***Initialization completed***");

        //Displaying intialized vallues
        System.out.println("Array elements are: ");
        for(int i =0; i<a.length; i++){
            System.out.println(a[i]+"\t");
        }
    }
}
