
public class MemberFactory
{
   public Staff GetMember(String MemberType, int YearOfWork)
   {
	   if(MemberType.equalsIgnoreCase("Doctor"))
	   {
		 return new Doctor(YearOfWork);
	   }
	   else if(MemberType.equalsIgnoreCase("Teachingassistant"))
	   {
		 return new TeachingAssistant(YearOfWork);
	   }
	   else
	   {
		   return null;
	   }
   }
}
