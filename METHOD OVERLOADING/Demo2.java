// using static and and non static method;
class Demo2 
{
	public static void m1()
	{
		System.out.println("m1 no args");
	}
	
	public static void m1(int i)
	{
		System.out.println("m1-int-args");
	}
	
	public void m1(double b) /* Non static method (cls.name = new class);*/
	{
		System.out.println("m1-double-arg");
	}
	
	public static void main(String[] args) 
	{
		m1();
		m1(10);
		Demo d = new Demo();
		d.m1(5);
	}
}
