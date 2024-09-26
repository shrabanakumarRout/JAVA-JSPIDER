// to check the vowel alphabet
import java.util.Scanner;
class Test6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		char ch = sc.next().charAt(0);
		//int vowel = (a,e,i,o,u);
		
		if(ch=='i' || ch=='o'||ch=='a'||ch=='e'||ch=='u')
		{
			System.out.println(ch + " " + "is vowel character");
		}
		else 
			{
			System.out.println(ch + " " + "is not a vowel number");
			}
	}
}
