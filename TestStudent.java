package orel;

public class TestStudent 
{
	public static void main(String [] args) 
	{
		Date s1birthDay = new Date(15 , 9 , 2004);
		Date s2birthDay = new Date(3 , 3 , 2005);
		Date s3birthDay = new Date(15 , 9 , 2004);
	
		Student s1Student = new Student("Tal" , "111" , 'F' , s1birthDay);
		Student s2Student = new Student("Ron" , "222" , 'M' , s2birthDay);
		Student s3Student = new Student("Ben" , "333" , 'M' , s3birthDay);
		
		s1Student.toString();
		s2Student.toString();
		s3Student.toString();
		
		System.out.println("s1Student and s3Student same birthday: " + s1birthDay.isTheSame(s3birthDay));
		
	}
}
