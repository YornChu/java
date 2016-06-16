public class TestPrivate
{
	private int x=3;
	public static void main(String[] args)
	{
		new TestPrivate().func(new TestPrivate());
	}
	public void func(TestPrivate a)
	{
		System.out.println(a.x);;;;
	}
}
