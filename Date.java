package orel;

public class Date
{
	private int day; //יום
	private int month; // חודש
	private int year; // שנה

	public Date(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(Date o)  // בנאי העתקה
	{
		this.day = o.day;
		this.month = o.month;
		this.year = o.year;
	}
	public int getDay() 
	{
		return day;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public boolean isTheSame(Date o) 
	{
		return this.day == o.day && this.month == o.month && this.year == o.year;
	}
	public String toString()
	{
		return "day: " + day + "month: " + month + "year: " + year;
	}
}
