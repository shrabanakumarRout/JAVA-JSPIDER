class D 
{
	int i;
	void m1()
	{
		int i =10;
		D d1 = new D();
		d1.i = 30;
		System.out.println("A"+i);
		System.out.println("B"+this.i);
		System.out.println("C"+d1.i);
	}
}
		
class Test8
{
    public static void main(String[] args) 
	{
		D ob1 = new D();
		ob1.i=20;
		ob1.m1();
	}
}
