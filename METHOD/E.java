class E 
{
	public static void main(String[] args) 
	{
		int i = m1();
		System.out.println("i=" +i);
		
		int j = m1() * 2;
		System.out.println("j=" +j);
		
		System.out.println(m1());
		 
		 int a =m1()+15;
		 System.out.println(a);
		 
		 m1();
	}
	static int m1()
	{
		System.out.println("executing m1");
		return 10;
    }
}
