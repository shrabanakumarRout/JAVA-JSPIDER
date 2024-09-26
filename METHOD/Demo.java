class Demo 
{
public	static void m1(int...a)
	{
		System.out.println("m1 is called");
	
	}
			
	public static void main(String[] args) 
	{
		m1(10);
		m1(20,30);
		m1(40,50,60);
	}
}
