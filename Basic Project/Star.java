public class Star {
    public static void SRT(int n){
        int a,b;

        //Outer loop to handle number of rows
        //k in this case

        for(a = 0; a<n; a++){

            //inner loop to handle number of columns
            //Values changing acc.to outer loop

            for(b=0; b<=a; b++){
                //Printing stars
                System.out.print("* ");

            }
            //End  -line
            System.out.println();
        }
    }
    //Driver Function
    public static void main(String[] args) {
        int k = 5;
        SRT(k);
    }
}
