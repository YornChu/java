class A
{
	public void func1()
	{
		System.out.println("this is fun1 from A");
	}
	public void func2()
	{
		func1();
	}
}
class B extends A
{
	public void func1()
	{
		System.out.println("this is func1 from B");
	}
	public void func3()
	{
		System.out.println("this is func3 from B");
	}
}
class C extends A
{
	public static void main(String [] args)
	{
		B b=new B();
		A a=b;
		//callA(a);
		callA(new A());
		//callA(new C());
		
	}
	/*public static void callA(A a)
	{
		a.func1();
		a.func2();
	}*/
	public static void callA(A a)
	{
		if(a instanceof B)
		{
			B b=(B) a;
		b.func1();
		b.func2();
		b.func3();
		}
		else
			{
				a.func1();
				a.func2();
			}
	}
}




