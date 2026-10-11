
public class Rectangle
{
	private Point bottomLeft; 
	private double w,h; 
	
	public Rectangle(Point bl , Point tr)
	{
		this.bottomLeft = new Point(bl);
		this.w = Math.abs(bl.getX() - tr.getX());
		this.h = Math.abs(bl.getY() - tr.getY());
	}
	
	public Rectangle(Point bl1 , double w1 , double h1) 
	{
		this.bottomLeft = new Point(bl1);
		this.w = w1;
		this.h = h1;
	}
	public double getArea() 
	{
		return w * h;
	}
	public double getPerimeter() 
	{
		return 2 * (w + h);
	}
	public void move(double deltaX , double deltaY) 
	{
		bottomLeft.setX(bottomLeft.getX() + deltaX);
		bottomLeft.setY(bottomLeft.getY() + deltaY);
	}
	public String toString() 
	{
		return "bottomLeft: " + this.bottomLeft + "topRight: " + (this.bottomLeft.getX() + w) + (this.bottomLeft.getY() + h); 
	}

}


