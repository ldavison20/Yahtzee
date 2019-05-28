import java.util.Random;
public class Die 
{
	private int value;
	private Random rand;
	
	public Die()
	{
		value = 0;
		rand = new Random();
		
	}
	public int roll()
	{
		value = rand.nextInt(6) + 1;
		return value;
	}
	
	public int getValue()
	{
		return value;
	}
	
}
