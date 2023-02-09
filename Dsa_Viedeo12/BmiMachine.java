package Dsa_Viedeo12;

public class BmiMachine extends HeartMonitor{

	public static void main(String[] args)
	{
		System.out.println(getMaxHeartRate(20));
	}
	public static int getMaxHeartRate(int age)
	{
		System.out.println("Sub Class");
		return 230-age;
	}
	
}
