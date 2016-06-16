class Chinese
{
	private static int people=0;
	static String country="China";
	int age;
	public Chinese()
	{
		people++;
	}
	public static int  getNumber()
	{
		return people;
	}
	void singOurcountry()
	{
		System.out.println("asasasasasas"+country);
	}
}
