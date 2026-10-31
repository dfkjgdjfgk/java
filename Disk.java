
public class Disk 
{
	private String name;
	private Song[] songArr;
	private final int MAXSONGS = 20;
	private int amount;
	
	public Disk(String name) 
	{
		this.name = name;
		this.songArr = new Song[MAXSONGS];
		this.amount = 0;
	}
	public void copyDisk(Disk o) 
	{
		this.name = o.name;
		this.songArr = o.songArr;
		this.amount = o.amount;
	}
	public String getName() 
	{
		return this.name;
	}
	public String getSong() 
	{
		for(int i = 0 ; i < amount ; i++) 
		{
			return songArr[i].getName();
		}
	}
	public void addSong(Song o) 
	{
		if(amount < MAXSONGS) 
		{
			songArr[amount] = o;
			amount++;
		}
	}
	public double longestSong() 
	{
		double max = 0;
		for (int i = 0 ; i < amount ; i ++) 
		{
			if (songArr[i].getLength() > max) 
			{
				max = songArr[i].getLength();
			}
		}
		return max;
	}
	public void month() 
	{
		int[] month = new int[12];
		int max = 0;
		for(int i = 0 ; i < amount ; i ++) 
		{
			Date firstDate = songArr[i].getFirstDate();
			month[firstDate.getMonth() - 1]++;
		}
		for (int i = 0 ; i < 12 ; i++) 
		{
			if(month[i] > max) 
			{
				max = month[i];
			}
		}
		System.out.println("month" + max);
	}
	public String toString() 
	{
		String soonngg ="song: ";
		for(int i = 0 ; i < amount ; i++) 
		{
			soonngg = soonngg + songArr[i].getName();
		}
		return "name: " + name + soonngg;
	}
	
}

