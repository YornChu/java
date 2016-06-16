public class Func2
{
   public static void drawRectangle(int x,int y)
   {
   	   for(int i=0;i<x;i++)
   	   	   {
   	   	   	   for(int j=0;j<y;j++)
   	   	   	   	   {
   	   	   	   	   	   System.out.print("*");
   	   	   	   	   }
   	   	   	   	   System.out.println();
   	   	   }
   	   	   System.out.println();
   }
   public static void main(String[] args)
   {
   	   drawRectangle(3,5);
   	   drawRectangle(2,4);
   	   drawRectangle(6,10);
   }
}
