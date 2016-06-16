public class zoumadeng
{
	public static void func()
	{
		int x=0;
		while(x<100)
			{
				x=(x+1)%10;
				System.out.println("*"+x+"*");
			}
	}
	public static void main(String[] args)
	{
		func();
	}
}

