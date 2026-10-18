

public class Point 
{
	private double x,y;

	public Point(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}
	public Point(Point other)
	{
		this.x = other.x;
		this.y = other.y;
	}
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
	public String toString() 
	{
		return "(" + x + "," + y + ")";
	}
	public double distance(Point other) {
		return Math.sqrt(Math.pow(this.y-other.y, 2)+Math.pow(this.x-other.x, 2));
	}
	
}
