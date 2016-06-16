class StaticOuter
{
	int outer_i=100;
	void test()
	{
		Inner in=new Inner();
		in.display();
	}
	static class Inner
	{
		void display()
		{
			System.out.println("display:outer_i="+outer_i);
		}
	}
}
