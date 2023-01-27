package Video12;

import java.util.ArrayList;

public class P5 {

	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		a.forEach(n->System.out.println(n));
		a.forEach(n-> {if(n%2==0) System.out.println(n);});
		
	}
	
}
