class TestThisA
{
  String name;
  public TestThisA(String x)
  {
  	  name=x;
  }
  public void func1()
  {
  	System.out.println("func of "+name+"is  calling") ; 
  }
  public void func2()
  {
  	  TestThisA a2=new TestThisA("a2");
  	  this.func1();
  	  a2.func1();
  }
}
