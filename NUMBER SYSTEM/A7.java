import java.util.Scanner;
// Check prime number or not 
class A7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean flag = true;
		if(n>=1)
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag = false;
					break;
				}
				
			}
			if (flag)
			{ 
				System.out.println(n+"is a prime number");
			}
			else{
				System.out.println(n + "is not aprime number");
			}
		}
	}
}
