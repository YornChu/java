public class Func3
{
	public static int getArea(int x,int y)
	{
		if(x<=0||y<=0) 
			return -1;
		return x*y;
	}
	
	public static void main(String[] args)
	{
		int area=getArea(3,5);
		System.out.println("first Area is"+area);
	}
}
