class B 
{
	int i ;
	
	static void m1()
	{
	//System.out.print (i);
	}
	
	void m2()
	{
		System.out.println(i);
	}


//class Test2[in this programme im saving the filename as b.java so prgrm will not execute without the main method]
//{
	public static void main (String [] args)
	{
		B b1 = new B();
		b1.i = 10;
		
		
		B b2 = new B();
		b2.i = 30;
		
		
		b1.m2();
		b2.m2();
    }
}