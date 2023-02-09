package Dsa_Viedeo12;

public class HeartMonitor {
	
	public String maxHeartRate;
	public static void main(String[] args)
	{
		System.out.println(getMaxHeartRate(20));
		
	}
	public static int getMaxHeartRate(int age)
	{
		System.out.println("Base Class");
		int res=0;
		res=220-age;
		return res;
	}
}
