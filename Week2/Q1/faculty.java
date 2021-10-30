
public class faculty extends Employee
{
private int office_hours;
private String rank;

public faculty(String office, double salary, MyDate datehired ,String Name, String address,int phoneNumber , String emailaddress ,int office_hours, String rank)
{
	super(Name,address,phoneNumber,emailaddress,office,salary,datehired);
	this.setOffice_hours(office_hours);
	this.setRank(rank);
}

public int getOffice_hours() 
{
	return office_hours;
}

public void setOffice_hours(int office_hours) 
{
	this.office_hours = office_hours;
}

public String getRank() 
{
	return rank;
}

public void setRank(String rank)
{
	this.rank = rank;
}
@Override
	public String toString() {
		return super.toString();
	}
}
