class TestException
{
	public static void main(String [] args)
	{
		try
		{int result=new Test().divide(3,0);
		System.out.println("the result is ");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("this is normal");
	}
}
class Test
{
	public int divide(int a,int b)
	{
		return a/b;
	}
}
