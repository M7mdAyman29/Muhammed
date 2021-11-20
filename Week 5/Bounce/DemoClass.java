import java.util.Scanner;
public class DemoClass
{
    public static void main(String[] args)
    {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter Type Of Member");
	  String Member = input.next();
	  System.out.println("Enter Your Department");
	  String Department = input.next();
	  System.out.println("Enter Year Of Work ");
	  int Yearofwork = input.nextInt();
	  
	  AbstractFactory M =  FactoryProducer.getFactory(Department);

	  Staff Sf = M.GetMember(Member, Yearofwork);
	  
	  System.out.println("You Is "+ Member + " Your Department is " + Department + " Your Year Of Work is " + Sf.getYearsOfWork() + " Your Salary is " + Sf.GetSalary() );

	} 
}
