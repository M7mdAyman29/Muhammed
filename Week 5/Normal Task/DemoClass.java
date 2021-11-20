import java.util.Scanner;
public class DemoClass
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		
	  System.out.println("Enter Type Of Member");
	  String Member = input.next();
	  System.out.println("Enter Year Of Work ");
	  int Yearofwork = input.nextInt();
	  
	  MemberFactory M = new MemberFactory();
	  Staff Sf = M.GetMember(Member, Yearofwork);
	  
	  System.out.println("The Salary OF " + Member + " is :" + Sf.GetSalary());

	} }
