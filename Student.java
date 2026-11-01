package orel;

public class Student 
{
	private String name;
	private String id;
	private char gender;
	private Date birthDay;
	
	public Student(String name , String i , char gender , Date birthDay) 
	{
		this.name = name;
		this.id = i;
		this.gender = gender;
		this.birthDay = birthDay;
	}

	public String getId() 
	{
		return id;
	}

	public char getGender() 
	{
		return gender;
	}

	public Date getBirthDay() 
	{
		return birthDay;
	}
	public boolean twinBirth(Student o) 
	{
		if(this.birthDay.isTheSame(o.getBirthDay())) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public String toString() 
	{
		return "name: " + name + "id: " + id + "gender: " + gender + "birthday: " + birthDay;
	}
}
