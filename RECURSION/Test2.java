/* WAP to show all the no in the given range*/
import java.util.Scanner ;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the range");
		int end = sc.nextInt();
		display (1,end);
	}
	static void display (int a ,int end)
	{
		if (a>end)return;
		{
			System.out.println(a);
			display(a+1,end);
		}
	}
}
