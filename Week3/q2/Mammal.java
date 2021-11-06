
public class Mammal implements animal
{
 
	@Override
	public void eat(String favfood)
	{
		 System.out.println("it fav Food is "+favfood);

	}

	@Override
	public void travel(int numofleg)
	{
		 System.out.println("it traven on "+numofleg + " legs");
	}
    
	public int NoOfLegs(int numofleg)
	{
		return numofleg;
	}
	
	public String FavFood(String favfood)
	{
		return favfood;
	}
	
}
