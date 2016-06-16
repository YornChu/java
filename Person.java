 public class Person
{
	private int  age=10;
	private String name="unknown";
	static int   n=0;
	public Person()
	{
		
		System.out.println("the constructor "+n +"is calling");
		n++;
	}
	public Person(String Name)
	{
		name=Name;
		System.out.println("the constuctor "+n+"is calling");
		System.out.println("name is "+name);
		n++;
	}
	public Person(String Name,int Age)
	{
		this(Name);
		this.age=Age;
		System.out.println("the constuctor "+n+"is calling");
		n++;
		System.out.println("name is "+name);
		System.out.println("my age is"+age);
	}

	public void setAge(int i)
	{
		if(i<0||i>130)
			return;
		age=i;
	}
	public int getAge()
	{
		return age;
	}
	public void shout()
	{    
		System.out.println("listen to me ");
	}
	
}
