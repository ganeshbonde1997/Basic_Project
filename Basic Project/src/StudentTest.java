public class StudentTest {
    public static void main(String[] args) {
        TestException manager = new TestException();
 
        try {
            Student student = manager.find("010104");
        } 
        catch (CustomError ex)
        {
            System.err.print(ex);
        }
    }
}
