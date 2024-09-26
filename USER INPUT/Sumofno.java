import java.util.Scanner;
class Sumofno
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum = 0;
		String str=" ";
		for (int i =1;i<=n;i++)
		{
			sum+= i;
			str+= i;
			if(i<n) 
			{
			str += "+";
			}
		}
			str = str+"="+sum;
			System.out.println(str);
	}
}
