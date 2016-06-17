public class Person
{
	public String name;
	public int age;
	public Person(String name,int age)
	{
	   this.name=name;
	   this.age=age;
	}
	public Person()
	{
	}
	public final void getInfo()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
	
