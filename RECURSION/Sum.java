/* Sum of digits in a given range 1 to n ;*/
import java.util.Scanner;
class Sum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int res = sum(n);
		System.out.println("res"+res);
	}
	static int sum(int n)
	{
		if (n==1)return 1;
		{
			System.out.println(n);
			return n+sum (n-1);	
		}
	}
}
