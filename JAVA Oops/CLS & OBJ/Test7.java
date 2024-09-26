class  C
{
	int i;
	void m1(int i)
	{
		//this.i=i;
		System.out.println("A = "+i);
		System.out.println("B = "+this.i);
	}
	void m2()
	{
		System.out.println("C = "+i);
	}
	
}

class Test7
{
    public static void main(String[] args) 
	{
		C c1 = new C ();
		c1.m1(10);
		//C c2= new C();
		c1.m2();
	}
}
