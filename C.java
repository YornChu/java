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
	public void fun3()
	{
		System.out.println("this is func3 from c");
	}
}
class C
{
	public static void main(String [] args)
	{
		A a=new A();
		 B b=a;
		callA(a);
		callA(new B());
	}
	public static void callA(A a)
	{
		a.func1();
		a.func2();
	}
}




