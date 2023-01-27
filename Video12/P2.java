package Video12;

public class P2 implements P1{

	public static void main(String[] args)
	{
		P1 p=()->{return "I have nothing to Say";};

		System.out.println(p.say());
	}


}
