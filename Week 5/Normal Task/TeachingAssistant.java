
public class TeachingAssistant implements Staff
{
	 int YearsOfWork;
	   
	   public TeachingAssistant(int YearsOFWork)
	   {
		  this.YearsOfWork = YearsOFWork;   
	   }

	   @Override
	   public double GetSalary() 
	   {
		   return 800 * getYearsOfWork();
	   }
	   
	   @Override
	   public int getYearsOfWork() 
	   {
		return YearsOfWork;
	   }
}
	