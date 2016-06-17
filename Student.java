class Student extends Person
{
	final String school=new String();
	public void study()
	{
		System.out.println("Learning");
	}
	public Student(String name,int age)
	{
		super(name,age);
	}
	public void getInfo()
	{
		super.getInfo();
		System.out.println(school);
	}
	public static void main(String[] args)
	{
		Person p=new Person("Stttt",12);
		p.getInfo();
		Student s=new Student("STTTTT",34);
		s.school="Tsinghua University";
		s.getInfo();
		s.study();
	}
}
