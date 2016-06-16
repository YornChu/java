class TestStatic
{
	static 
	{
		System.out.println("TestStatic is loading");
	}
	public static void main(String[] args)
	{
		System.out.println("begin executing main method");
		new StaticCode();
		new StaticCode();
	}
}
