package Array;

import java.util.Arrays;

public class ArrayEx5 {
    //copying one elements from one array to another
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int[] b = a;
        System.out.println("before copying elements into an array : " + Arrays.toString(a));
        System.out.println("After copying elements into an array:" + Arrays.toString(b));

    }
}
