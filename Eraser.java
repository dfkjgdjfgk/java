
public class Eraser
{
	private String color;
	private String shape;
	private float price;
	
	public Eraser(String color , String shape , float price) 
	{
		this.color = color;
		this.shape = shape;
		this.price = price;
	}
	public Eraser(Eraser o) 
	{
		this.color = o.color;
		this.shape = o.shape;
		this.price = o.price;
	}
	public float getPrice() 
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public String getColor() 
	{
		return color;
	}
	public String getShape() 
	{
		return shape;
	}
	public String toString()
	{
		return "color: " + color + "shape: " + shape + "price: " + price;
	}
	
	
}
