class Student extends Person implements InterfaceRunner
{
	 String school=new String();
	public void run()
	{
		System.out.println("the student is running");
	}
	public void study()
	{
		System.out.println("Learning");
	}
	boolean equals(Object obj)
	{
		Student st=null;
		if(obj instanceof Student)
			st=(Student) obj;
		else 
			return false;
		if(st.name==this.name&&st.age==this.age)
			return true;
		else 
			return false;
	}
	public Student(String name,int age)
	{
		super(name,age);
	}
	public Student()
	{
		
	}
	public void getInfo()
	{
		super.getInfo();
		System.out.println(school);
	}
	public static void main(String[] args)
	{
		Person p=new Person("Stttt",12);
		Student s=new Student();
		if(!s.equals(p))
			{
				System.out.println("false");
			}
		/*p.getInfo();
		Student s=new Student("STTTTT",34);
		s.school="Tsinghua University";
		s.getInfo();
		s.study();
		s.run();*/
	}
}
