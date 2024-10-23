import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		scanner sc = new scanner(System.in);
		System.out.println("Enter the First no);
		int m = sc.nextInt();
		if (n<=1)
		{
			System.out.println(n + " "  + "is not a prime number"+);
		}
		for (int i = 2;i<=n/2;i++ )
		{
			if(n%i == 0)
			{
				System.out.println(n +  "  " + "is not a prime number");
			}
			else{
		System.out.println(n +" " +"is a prime number");
			}
		}
	}
}
