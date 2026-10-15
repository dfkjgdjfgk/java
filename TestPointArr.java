
public class TestPointArr {

	public static void main(String[] args) 
	{
		Point[] pointarr = new Point[4];
		
		pointarr[0] = new Point(1,1);
		pointarr[0] = new Point(2,2);
		pointarr[0] = new Point(3,3);
		pointarr[0] = new Point(4,4);
		
		aura(pointarr);
		auraaa(pointarr);
	}
	public static int aura(Point[] arr) 
	{
		double max = arr[0].getX() + arr[0].getY();
		int max_indx = 0;
		
		for(int i = 0 ; i < arr.length ; i++) 
		{
			if (arr[i].getX() + arr[i].getY() > max) 
			{
				max_indx = i ;
				max=arr[i].getX() + arr[i].getY();
			}
		}
		
		return max_indx;
	}
	public static int auraaa(Point[] arr)

	{
		double min = arr[0].distance(arr[1]);
		int min_indx = 0;
		
		for(int i = 0 ; i < arr.length ; i++) 
		{
			if (arr[i].distance(arr[i + 1]) < min) 
			{
				min_indx = i ;
				min = arr[i].distance(arr[i + 1]) ;
			}
		}	
		return min;
	}
}
	
