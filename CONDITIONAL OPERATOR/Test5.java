// to check given number is single or not
import java.util.Scanner;
class Test5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		if (a>0 && a<9)
		{
			System.out.println( a + " " + " is single digit");
		}
		else
		{
		    System.out.println(a + " " + " is not a single digit");
		}
	}
}
