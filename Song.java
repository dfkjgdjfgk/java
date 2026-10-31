
public class Song
{
	private Date firstDate;
	private String name;
	private double length;
	
	public Song(String name , Date firstDate,  double length) 
	{
		this.firstDate = firstDate;
		this.length = length;
		this.name = name;
	}
	public Song(Song o) 
	{
		this.firstDate = o.firstDate;
		this.length = o.length;
		this.name = o.name;
	}
	public Date getFirstDate() 
	{
		return firstDate;
	}
	public void setFirstDate(Date firstDate) 
	{
		this.firstDate = firstDate;
	}
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public String getName()
	{
		return name;
	}
	public String toString() 
	{
		return "name: " + name + "length: " + length + "FirstDate: " + FirstDate;
	}
	
}
