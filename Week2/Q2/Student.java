
public class Student 
{
 private String Studentname;
 private int StudentID;
 private double StudentGPA;
 private subject Studentsubject;
 private address Studentaddress;
 
 public Student (String Studentname ,int StudentID, double StudentGPA,subject Studentsubject, address Studebtaddress)
 {
	 this.setStudentaddress(Studebtaddress);
	 this.setStudentGPA(StudentGPA);
	 this.setStudentID(StudentID);
	 this.setStudentname(Studentname);
	 this.setStudentsubject(Studentsubject);
 }

public String getStudentname()
{
	return Studentname;
}

public void setStudentname(String studentname)
{
	Studentname = studentname;
}

public int getStudentID() 
{
	return StudentID;
}

public void setStudentID(int studentID) 
{
	StudentID = studentID;
}

public double getStudentGPA()
{
	return StudentGPA;
}

public void setStudentGPA(double studentGPA) 
{
	StudentGPA = studentGPA;
}

public subject getStudentsubject() 
{
	return Studentsubject;
}

public void setStudentsubject(subject studentsubject) 
{
	Studentsubject = studentsubject;
}

public address getStudentaddress() 
{
	return Studentaddress;
}

public void setStudentaddress(address studentaddress)
{
	Studentaddress = studentaddress;
}
public void print()
{
	System.out.println("your name is : " +Studentname + "\n Your ID is : "+StudentID + "\n Your GPA is : " + StudentGPA );
	System.out.println(" Your Subject Name is : " + Studentsubject.subjectName + "\n Your Subject Hours is : "+ Studentsubject.subjectHours + "\n Your Subject ID is : " +  Studentsubject.SubjectID);
	System.out.println(" Your Street No is : " + Studentaddress.streetNO + "\n Your City is : "+ Studentaddress.city + "\n Your Country  is : " +  Studentaddress.country);

}
}
