package orel;

public class Point 
{
	private double x,y;
	public double getX() 
	{
		return x; 
		}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getY() 
	{
		return y;
		}
	public void setY(double y)
	{
		this.y = y;
		}
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public Point(Point o)
	{
		this.x=o.x;
		this.y=o.y;
	}
	public String toString() 
	{
		return "(" + x + "," + y + ")";
	}
	public double distance(Point o) 
	{
		return Math.sqrt(Math.pow(this.x-o.x,2)+Math.pow(this.y-o.y, 2)); 
	}
	public boolean equal(Point o) 
	{
		return x==o.x && y==o.y;
	}
}