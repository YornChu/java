class Student extends Person
{
	public void study()
	{
		System.out.println("Learning");
	}
	public static void main(String[] args)
	{
		Person p=new Person("Stttt",12);
		p.getInfo();
		Student s=new Student();
		s.getInfo();
		s.study();
	}
}
