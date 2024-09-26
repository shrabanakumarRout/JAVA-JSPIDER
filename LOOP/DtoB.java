import java.util.Scanner;
class  DtoB
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String b = "";
		int n = sc.nextInt();
		int temp = n;
		
		while(n>0)
		{
			int rem = n%2;
			n/=2;
			b=rem+b;
		}
		System.out.println("Binary equivalent of the number is " + b);
	}
}
