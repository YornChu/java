public class ShiftTest
{
	public static void main(String[] args)
	{
		int x=0x80000000;
		int y=0x80000000;
		x=x>>1;
		y=y>>>1;
	        System.out.println(">>"+Integer.toHexString(x));
	        System.out.println(">>>"+Integer.toHexString(y));
	}
}
