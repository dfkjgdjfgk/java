
public class Car
{
	private String type;
	private String color;
	private int kamash;
	
	public Car(String type , String color , int kamash) 
	{
		 this.type = type;
		 this.color = color;
		 this.kamash = kamash;
	}
	public String getType() 
	{
		return this.type;
	}
	public String getColor() 
	{
		return this.color;
	}
	public int getKamash() 
	{
		return this.kamash;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	public void setKamash(int kamash) 
	{
		this.kamash = kamash;
	}
	
}
