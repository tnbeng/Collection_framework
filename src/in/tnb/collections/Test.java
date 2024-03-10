package in.tnb.collections;

interface A
{
   void fun();
}
abstract class Abc implements A
{
	abstract void abfun();
	void abfunon()
	{
		System.out.println("I am from Abs Abstract Abc");
	}
}
class C implements A
{
	public void fun()
	{
		System.out.println("I am from Class C");
	}
}
class B implements A
{

	public void fun()
	{
		System.out.println("I am from Class B");
	}
	public void personal()
	{
	       System.out.println();	
	}
	
}

public class Test {

	public static void main(String[] args) {
	//	 ab=new B();
		A a=new B();
		a.fun();
	}

}
