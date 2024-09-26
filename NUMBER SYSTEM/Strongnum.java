class Strongnum 
{
	public static void main(String[] args) 
	{
		int n = 145;
		int strong = 0;
		int temp;
		int copy = n;
		
		while (n>0)
		{
			temp=n%10;
			int x = fact(temp);
			strong = strong + x;
			n/=10;	
		}
		if (copy == strong)
		{
			System.out.println("Yes");
		}
			else
				System.out.println("No");
	}
	static int fact(int y)
	{
		int f = 1;
		for(int i=y;i>0;i--)
		{
			f=f*i;
		}
		return f;
	}
}
