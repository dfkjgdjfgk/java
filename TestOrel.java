package orel;

public class TestOrel 
{
	public static void main(String [] args) 
	{
		int r = (int)(Math.random()*50) +1;
		for (int i = 0 ; i < r ; i++) 
		{
			Counter c = new Counter(); 
		}
		System.out.println("the count is: " + Counter.getCount());
	}
}
