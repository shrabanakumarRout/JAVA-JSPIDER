class D 
{
	int i ;
	int j;
	D()
	{
		 i = 10;
	}
	D(int arg)
	{
		j=arg ;
	}
}
	class Test4{
		
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
		D d2 = new D(20);
		System.out.println(d2.j);
	}
}
