
class Num
{
	int a;
	int b;
	void add()
	{
		System.out.println(a+b);
	}
	
	public static void main(String [] args) 
	{
		Num n1 = new Num();
		n1.a = 10;
		n1.b = 20;
		Num n2 = new Num();
		n2.a=30;
		n2.b=40;
		
		n1.add();
		n2.add();
	}
}
