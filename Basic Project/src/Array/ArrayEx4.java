package Array;

public class ArrayEx4 {
    //Check whetehr which arrays have same element

    public static void main(String[] args) {
        //declare and Intialize an array
        int a[] = {10,20,30,40,50,60};
        int b[] = a;
        int c[] = {10,20,30,40,50,60};
        int d[] ={60,40,50,30,20,10};
        if(a==b)
        {
            System.out.println("Array a and Array b are same");
        }
        else
        {
            System.out.println("Array's are different");
        }

        if(a==c){
            System.out.println("Arrays a and c are same");
        }
        else
        {
            System.out.println("Arrays are different");
        }
        if(a==d)
        {
            System.out.println("Array a and Array d are same");
        }
        else {
            System.out.println("Arrays are different ");
        }


    }
}
