
public class TestException {
 
    public Student find(String studentID) throws CustomError {
        if (studentID.equals("123456")) {
            return new Student();
        } else {
            throw new CustomError(
                "Could not find student with ID " + studentID);
        }

    	public Student find(String studentID) {
    		// TODO Auto-generated method stub
    		return null;
    	}
    }
}