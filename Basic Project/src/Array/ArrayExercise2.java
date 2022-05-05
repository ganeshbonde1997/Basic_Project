package Array;

public class ArrayExercise2 {
    //program to print sum of elements in the array and average
    public static void main(String[] args) {
        int []numbers = new int[]{12,12,55,66,87,98,45};
        //Caluculate sum of all Numbers
        int sum = 0;
        for(int i=0; i<numbers.length; i++)
        sum = sum + numbers[i];
        //Calculate the average value
        int average = sum/ numbers.length;
        System.out.println("The average of number is " +average );

    }
}
