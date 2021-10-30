
public class Employee extends Person
{
	private String office;
	private double salary;
	private MyDate datehired;
    public Employee(String Name, String address,int phoneNumber , String emailaddress,String office, double salary, MyDate datehired) 
	{
	    	super(Name,address,phoneNumber,emailaddress);
	    	this.office = office;
	    	this.salary = salary;
	    	this.datehired = datehired;
	}
	public String getOffice() 
	{
		return office;
	}
	public void setOffice(String office) 
	{
		this.office = office;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public MyDate getDatehired() 
	{
		return datehired;
	}
	public void setDatehired(MyDate datehired)
	{
		this.datehired = datehired;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
}
