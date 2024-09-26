//if non static variable present in the cls then how to initialize it ?
class C
{
	int i ;
	C(int a)
	{
		i=a;
	}
		
	public static void main(String[] args) 
	{
		C a1 = new C(20);
		//A a2 = new A();
		System.out.println(a1.i);
	}
}
