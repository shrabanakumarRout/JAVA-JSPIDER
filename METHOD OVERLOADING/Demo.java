class Demo 
{
	public static void m1()
	{
		System.out.println("m1-no-argument");
	}
	
	public static void m1(int a)
	{
		System.out.println("m1-int-argument");
	}
	
	public static void m1(int a, int b)
	{
		System.out.println("m1-int , int-arg");
	}
	
	public static void main(String[] args) 
	{
		m1();
		m1(10);
		m1(5,10);
	}
}
