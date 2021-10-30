
public class Staff extends Employee
{
    private String title;
    public Staff (String title ,String Name, String address,int phoneNumber , String emailaddress,String office, double salary, MyDate datehired)
    {
	   super(Name,address,phoneNumber,emailaddress,office,salary,datehired);
	   this.setTitle(title);
    }
    public String getTitle()
    {
	   return title;
    }
    public void setTitle(String title)
    {
	   this.title = title;
    }
    @Override
	public String toString()
    {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
