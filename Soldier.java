
public class Soldier 
{
	private double hight;
	private String name;

	public Soldier(double hight, String name) 
	{
		this.hight = hight;
		this.name = name;
	}
	public double gethight() 
	{
		return this.hight;
	}
	public String getname() 
	{
		return this.name;
	}
	public String toString() 
	{
		return "name: " + this.name + "hight: " + this.hight;
	}

}
