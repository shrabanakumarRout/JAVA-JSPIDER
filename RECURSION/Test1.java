/* WAP to print natural numbers using recursion. */
class Test1 
{
	public static void main(String[] args) 
	{
		display(1);
	}
	static void display(int n)
	{
		if (n>9)return;
		{
			System.out.println(n);
			display (n+1);
		}
	}
}
