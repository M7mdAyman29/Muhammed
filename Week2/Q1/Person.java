
public class Person
{
 private String Name;
 private String address;
 private int phoneNumber;
 private String emailaddress;
 public  Person(String Name, String address,int phoneNumber , String emailaddress)
 {
	 this.setName(Name);
	 this.setAddress(address);
	 this.setPhoneNumber(phoneNumber);
	 this.setEmailaddress(emailaddress);
 }
public String getName()
{
	return Name;
}
public void setName(String name)
{
	Name = name;
}
public String getAddress()
{
	return address;
}
public void setAddress(String address) 
{
	this.address = address;
}
public int getPhoneNumber()
{
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) 
{
	this.phoneNumber = phoneNumber;
}
public String getEmailaddress()
{
	return emailaddress;
}
public void setEmailaddress(String emailaddress) 
{
	this.emailaddress = emailaddress;
}
public String toString()
{
		return "The Class Name Is " +this.getClass().getName() +" \n The Person Name Is "+Name ;
}

}
