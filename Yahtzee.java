import java.util.Random;
public class Yahtzee 
{
	private Die[] dice;
	private int[] count;
	
	public Yahtzee()
	{
		dice = new Die[5];
		for(int i = 0; i < 5; i++)
		{
			dice[i] = new Die();
		}
		count = new int[6];
		updateCount();
		
	}
	
	public void rollAllDice()
	{
		for(int i = 0; i < dice.length; i++)
		{
			dice[i].roll();
		}
	}
	public void rollADie(int dieNumber)
	{
		if(dieNumber == 1)
		{
			dice[0].roll();
		}
		else if(dieNumber == 2)
		{
			dice[1].roll();
		}
		else if(dieNumber == 3)
		{
			dice[2].roll();
		}
		else if(dieNumber ==  4)
		{
			dice[3].roll();
		}
		else if(dieNumber == 5)
		{
			dice[4].roll();
		}
		
	}
	public int getADie(int dieNumber)
	{
		int value = 0;
		if(dieNumber == 1)
		{
			value = dice[0].getValue();
		}
		else if(dieNumber == 2)
		{
			value = dice[1].getValue();
		}
		else if(dieNumber == 3)
		{
			value = dice[2].getValue();
		}
		else if(dieNumber ==  4)
		{
			value = dice[3].getValue();
		}
		else if(dieNumber == 5)
		{
			value = dice[4].getValue();
		}
		return value;
	}
	public String showDice()
	{
		String out = "+------+---+---+---+---+---+\r\n" +
					"| Dice | 1 | 2 | 3 | 4 | 5 |\r\n" +
				"+------+---+---+---+---+---+\r\n" +
					"| Face | " +
					dice[0].getValue() + " | " + dice[1].getValue() + " | " +
					dice[2].getValue() + " | " + dice[3].getValue() + " | " +
					dice[4].getValue() + " |\r\n" +
					"+------+---+---+---+---+---+";
	return out;
			
	}
	private int countUp(int value)
	{
		int n = 0;
		for(int i = 0; i <= dice.length; i++)
		{
			if(value == i)
			{
				n++;
			}
		}
		return n;
	}
	public void updateCount()
	{
		for(int i = 0; i < 6; i++)
		{
			count[i] = countUp(i + 1);
		}
	}


	
}
