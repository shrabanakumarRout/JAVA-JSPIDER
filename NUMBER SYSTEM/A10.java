import java.util.Scanner;
class A10 
//sum digit of a number to get single digit
{
	public static void main(String[] args) 
	{    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a = sc.nextInt();
		int store = 0 ;
		int sum = 0;
		while(a>0)// Repeat until the number is a single digit
		{
		  store= a%10;// add the last digit
		
			 sum+= store;
			a/=10;
			
		
		if (a==0 && sum>9)
			{
			a=sum;
			sum=0;
				
			}
		}
		System.out.println("Single-digit sum:" +sum);
		
	}
}
