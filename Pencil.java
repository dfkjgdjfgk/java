
public class Pencil
{
	private String color;
	private boolean sharp;
	private float price;
	
	public Pencil(boolean sharp , String color , float price) 
	{
		this.color = color;
		this.sharp = sharp;
		this.price = price;
	}
	public Pencil(Pencil o) 
	{
		this.color = o.color;
		this.price = o.price;
		this.sharp = o.sharp;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean isSharp() 
	{
		return sharp;
	}
	public void setSharp(boolean sharp) 
	{
		this.sharp = sharp;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public String toString() 
	{
		return "color: " + color + "sharp: " + sharp + "price: " + price;
	}
	public boolean sameColor(Pencil o) 
	{
		if(this.color == o.getColor()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
