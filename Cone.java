package orel;

public class Cone extends Circle
{
	private double height;
	
	public Cone(Point center , double height , double radios) 
	{
		super(center , radios);
		this.height = height;
	}

	public double getHight() 
	{
		return height;
	}

	public void setHight(double height) 
	{
		this.height = height;
	}
	
	public double getBaseArea() 
	{
		return super.getArea();
	}
	public double slantHeight()
	{
		return Math.sqrt(super.radios * super.radios + height * height);
	}
	public double lateralSurfaceArea()
	{
		return Math.PI * super.radios * slantHeight();
	}
	public double totalSurfaceArea()
	{
		return Math.PI * super.radios * (super.radios + slantHeight());
	}
	public double volume() 
	{
		return (Math.PI * super.radios * super.radios * height) / 3.0;
	}
	public String toString()
	{
		return "radios: " + super.radios + "center: " + super.center + "height: " + this.height;
	}
}
	
	

