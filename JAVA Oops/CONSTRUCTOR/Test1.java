class A 
{
	A()
	{
		System.out.println("A arg const");
	}
	
	A(int i)
	{
		this ();
		System.out.println("A int const");
	}
}

class Test1
{
	public static void main (String [] args)
	{
		//new A();
		new A(1);
	}
}