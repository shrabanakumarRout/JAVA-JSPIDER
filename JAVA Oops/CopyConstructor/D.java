class D 
{
	static
	{
		System.out.println("static 1");
	}
	{
		System.out.println("non static 1");
	}
	D()
	{
		System.out.println("A const");
	}
	static 
	{
		System.out.println("static 2");
		D d = new D();
	}
	{
		System.out.println("non static 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		D d1 = new D();
		System.out.println("main Ends");
		
	}
}
