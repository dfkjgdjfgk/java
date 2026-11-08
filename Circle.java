package orel;

public class Circle 
{
	protected Point center;
	protected double radios;

	public Circle(Point center, double radios)
	{
		this.center = new Point(center);
		this.radios = radios;
	}
	public Point getCenter()
	{
		return new Point(center);
	}
	public void setCenter(Point center) 
	{
		this.center = new Point(center);
		}
	public double getRadios()
	{
		return radios;
	}
	public void setRadios(double radios) 
	{
		this.radios = radios;
	}
	public double getArea() 
	{
		return Math.PI*radios*radios;
	}
	public double getPeramter() 
	{
		return 2*Math.PI*radios;}
	public String toString() 
	{
		return "Circle [center=" + center + ", radios=" + radios + "]";
	}
	
	public boolean equal(Circle o) 
	{
		return o.center.equal(this.center) && o.radios==this.radios;
	}
}