class B 
{
	{
	System.out.println("non static block 1");
    }

	public static void main(String[] args) 
	{
		System.out.println("M1 Starts");
		B b = new B();
		System.out.println("M1 Ends");
	}
	
	{
	System.out.println("non static block 2");
	}
}
