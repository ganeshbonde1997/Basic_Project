package Array;

import java.util.Arrays;
//Sorting an Array
public class ArrayExercise1 {
    public static void main(String[] args) {
        int arr[] = {123,156,559,114,148,659};
        String str[]= {"Kunal", "Vinod","Kiran","Sahil", "Aditya"};
        //Printing the Original List
        System.out.println("Original Array" + Arrays.toString(arr));
        Arrays.sort(arr);
        //After sorting array
        System.out.println("After Sorting array" + Arrays.toString(arr));
        Arrays.sort(str);
        System.out.println("After Sorting string array" + Arrays.toString(str));
    }
}

