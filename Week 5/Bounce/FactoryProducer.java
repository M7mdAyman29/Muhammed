
public class FactoryProducer
{
	public static AbstractFactory getFactory(String Department)
	   {
		    	   if(Department.equalsIgnoreCase("IS"))
		    	   {
		    		 return new ISMemberFactory();
		    	   }
		    	   else if(Department.equalsIgnoreCase("CS"))
		    	   {
		    		 return new ISMemberFactory();
		    	   }
		    	   else if(Department.equalsIgnoreCase("IT"))
		    	   {
		    		 return new ISMemberFactory();
		    	   }
		    	   else 
		    	   {
		    		   return null;
		    	   }
	   }
}
