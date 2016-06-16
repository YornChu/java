class TestPerson
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.shout();
		Person p2=new Person("Jack");
		p2.shout();
		Person p3=new Person("Tom",18);
		p3.shout();
	}
}
