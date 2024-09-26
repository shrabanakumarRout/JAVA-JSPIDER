
import java.util.Scanner;
class a
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n%2 == 0)
		{
			System.out.println(n + "is an even number");
		}
		
		
		System.out.println(n +"is an odd number ");
	
	}
}
