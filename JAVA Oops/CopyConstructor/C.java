class C 
{
	{
		System.out.println("nonstatic block1");
	}
	
	C()
	{
		System.out.println("C cons");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		new C();
		new C(10);
		System.out.println("main Ends");
	}
	C(int i)
	{
		System.out.println("C-const-int");
	}
	{
		System.out.println("Non Static block2");
	}
}
