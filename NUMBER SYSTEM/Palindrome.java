import java.util.Scanner;
class Palindrome
  {
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(n>0)
		{
			int digit = n % 10;
			rev = rev*10+digit;
			n/=10;
		}
		if (temp == rev)
		{
			System.out.println( rev + " " + "is a palindrome number");
		}
		else
		{
			System.out.println(rev + " " + "is not a palindrome number");
		}
	}
}
