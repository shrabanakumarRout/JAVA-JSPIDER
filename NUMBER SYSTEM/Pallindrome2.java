class Pallindrome2 
{
	public static void main(String[] args) 
	{
		int a = 252;
		int temp = a;
		int rev=0;
		while (temp>0)
		{
			int digit = a%10;
			rev = rev*10+digit;
			a/=10;
		}
		if (rev==temp)
		{
			System.out.println(rev+" "+ "is a PN");
		}
		else
		{
			System.out.println("It is not a PN");
		}
	}
}