class Test10 
{
	int i;
	public void m1()
	{
		Test10 t = new Test10();
		t.i = 30;
		//Test10 t = new Test10();
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public static void main(String[] args) 
	{
	   Test10 t = new Test10();
	   t.i=80;
	   t.m1();
	}
}
