
public class Pen
{
	private String color;
	private boolean erasable;
	private float price;
	
	public Pen(String color , boolean erasable , float price) 
	{
		this.color = color;
		this.erasable = erasable;;
		this.price = price;
	}
	public Pen(Pen o)
	{
		this.color = o.color;
		this.erasable = o.erasable;
		this.price = o.price;
	}
	public float getPrice() 
	{
		return this.price;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
	public String getColor() 
	{
		return this.color;
	}
	public boolean getErasable() 
	{
		return this.erasable;
	}
	public String toString() 
	{
		return "color: " + this.color + "price: " + this.price + "erasable: " + this.erasable;
	}
	public String exp(Pen o) 
	{
		Pen penn =new Pen("blue" , true , 67);
		
		if(penn.getPrice() == o.getPrice()) 
		{
			return "the price is the same!!!";
		}
		if(penn.getPrice() > o.getPrice()) 
		{
			return "the color of the most exp pen is: " + penn.getColor();
		}
		else
		{
			return "the color of the most exp pen is: " + o.getColor();
		}
	}
	public float avg(Pen o) 
	{
		Pen penn =new Pen("blue" , true , 67);
		
		return (penn.getPrice() + o.getPrice()) / 2;
	}
}
