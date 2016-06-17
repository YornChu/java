class Bird implements InterfaceRunner,Flyer
{
	public void run()
	{
		System.out.println("the bird is running");
	}
	public void fly()
	{
		System.out.println("the bird is flying");
	}
	public static void main(String[] args)
	{
		Bird bird=new Bird();
		System.out.println("asasa"+InterfaceRunner.ID);
		bird.run();
	}
}
