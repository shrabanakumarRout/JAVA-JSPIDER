class Primeno 
{
	public static void main(String[] args) 
	{
		int a = 12;
		boolean Flag = true;
		for (int i=2;i<=a/2;i++)
		{
			
			if(a%i==0)
				{
				Flag=false;
				break;
				}
		}
		if(Flag)
		{
			System.out.println(a+" "+ "is a prime no"); 
		}
			else
		    {
				System.out.println(a+" "+ "is not a prime no");
			}
	}
}