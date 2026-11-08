package orel;

public class Cylinder extends Circle
{
	protected int height;
	
	public Cylinder(Point center, double radios, int height) 
	{
		super(center, radios);
		this.height = height;
	}
	public double getArea() 
	{
		return super.getArea();
	}
	public double getVolume() 
	{
		return super.getArea() * height;
 	}
	public String toString() 
	{
		return "center: " + center + "radios: " + radios + "height: " + height;
	}
}
