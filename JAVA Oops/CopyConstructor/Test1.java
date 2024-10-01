// BLocks(non static and static)
class Test1 
{
	static int a;
	int b;
	static
	{
		a = 10;
	}
	{
		a = 20;
		b = 30;
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		Test1 t1 = new Test1(); 
		System.out.println(a); 
		System.out.println(t1.b); 
		{
			System.out.println("main starts");
		}
	}
}
