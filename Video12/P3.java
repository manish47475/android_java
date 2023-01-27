package Video12;

public interface P3 {

	void abstractFun(int x);
	default void normalFun()
	{
		System.out.println("Hello");
	}
}
