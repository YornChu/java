class TestFinal
{
	public void finalize()
	{
		System.out.println("the object is going");
	}
	public static void main(String[] args)
	{
		new TestFinal();
		new TestFinal();
		new TestFinal();
		System.gc();
		System.out.println("the program is ending");
	}
}
