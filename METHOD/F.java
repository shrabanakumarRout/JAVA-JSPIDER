class F 
{
	public static void main(String[] args) 
	{
		System.out.println(m2());
		int b = m2()+50;
		System.out.println(b);
	} 
	
	static int m1()
	{
		return 10+20;
	}
	
	static int m2()
	{
	return m1()+30;
    }
}
