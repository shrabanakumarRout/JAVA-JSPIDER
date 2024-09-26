// print the greatest of 2 number between the given no
import java.util.Scanner;
class Test4 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner (System.in);
	   
	   System.out.println("Enter the First number");
	   
	   int m = sc.nextInt();
	   
	   System.out.println("Enter the Second number");
	   
	   int n = sc.nextInt();
	   
	   if(m>n)
		{
		   System.out.println(m+" " +" is greater number");
		}
		else
		{
			System.out.println(n+" " +" is greater number");
		}
	}
}
