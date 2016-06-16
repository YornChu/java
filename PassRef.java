class PassRef
{
	int x;
	public static void main(String[] args)
	{
		PassRef obj=new PassRef();
		obj.x=5;
		change(obj);
		System.out.println(obj.x);
	}
	public static void change(PassRef obj)
	{
		obj=new PassRef();
		obj.x=3;
	}
}
