import java.util.Scanner;
//sum of the given no
class A8 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int Sum=0;
		while(n>0)
		{
			int temp=n%10;
		    Sum+=temp;
			n/=10;
		}
		
		System.out.println(Sum);
	}
}
