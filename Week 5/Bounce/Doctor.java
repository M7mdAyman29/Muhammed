
public class Doctor implements Staff
{
   int YearsOfWork;
   
   public Doctor(int YearsOFWork)
   {
	  this.YearsOfWork = YearsOFWork;   
   }

   @Override
   public double GetSalary() 
   {
	   return 2000 * getYearsOfWork();
   }
   
   @Override
   public int getYearsOfWork() 
   {
	return YearsOfWork;
   }
}
