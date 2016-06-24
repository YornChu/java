class Outer
{
	int outer_i=100;
	void test()
	{
		for(int i=0;i<5;i++)
			{
				class Inner
				{
					void display()
					{
						System.out.println("display"+outer_i);
					}
				}
				Inner inner =new Inner();
				inner.display();
			}
	}
}
