

public class Student extends Person
{
    private final Status StudentStatus;
    public Student(Status StudentStatus ,String Name, String address,int phoneNumber , String emailaddress) 
    {
    	super(Name,address,phoneNumber,emailaddress);
         this.StudentStatus = StudentStatus;
    }
	@Override
	public String toString()
	{
		return super.toString();
	}
}
