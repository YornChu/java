public class TestSingle
{
	private static final TestSingle onlyone=new TestSingle();
	private static int x=0;
	public static TestSingle getTestSingle()
	{
		return onlyone;
	}
	private TestSingle()
	{
		x++;
	}
	public void output()
	{
		System.out.println("hello    ");
	}
	public int getX()
	{
		return x;
	}
	
}
