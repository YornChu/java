class SingleMode
{
	public static void main(String[] args)
	{
		TestSingle one= TestSingle.getTestSingle();
		one.output();
		TestSingle two= TestSingle.getTestSingle();
		System.out.println("the num of obj is "+two.getX());
	}
}
