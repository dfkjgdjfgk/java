import java.util.Scanner;

public class TestCar
{
	public static void main(String type , String color , int kamash) 
	{
        Scanner input = new Scanner(System.in);
        
        Car [] cars = new Car[30];
        
		for(int i = 0 ; i < 30 ; i++) 
		{
			System.out.println("Enter your type: ");
            type = input.nextLine();

            System.out.println("Enter your color: ");
            color = input.nextLine();
            
            System.out.println("Enter your kamash: ");
            kamash = input.nextInt();

            cars[i] = new Car(type , color , kamash);
		}
	}
	
	public static void min_car(Car [] cars) 
	{
		int min = cars[0].getKamash();
		int mind = 0;
		for (int i = 0 ; i < 30 ; i++)
		{
			if (cars[i].getKamash() < min) 
			{
				mind = i;
				min = cars[i].getKamash();
			}
		}
		System.out.println(cars[mind].toString());
	}
	
	public static int avg_car(Car [] cars) 
	{
		int sum = 0;
		
		for (int i = 0 ; i < 30 ; i++)
		{
			sum += cars[i].getKamash();  
		}
		
		return sum;
	}
	
	public static int red_car(Car [] cars) 
	{
		int sum = 0;
		
		for (int i = 0 ; i < 30 ; i++)
		{
			if(cars[i].getColor()  == "red") 
			{  
				sum++;
			}
		}
		
		return sum;
	}
	
	public static void kamash_car (Car[] cars) 
	{
		for (int i = 0 ; i < 30 ; i++)
		{
			if(cars[i].getKamash()  >= 20000 && cars[i].getKamash() <= 40000) 
			{  
				cars[i].toString();
			}
		}
	}
}
