/*   x
    xxx
   xxxxx
  xxxxxxx
 xxxxxxxxx */
 import java.util.Scanner;
class Practise4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Range");
		int n = sc.nextInt();
		int star = 1;
	
	for (int i=1;i<=n;i++)
	{
		for (int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for (int k=1;k<=star;k++)
		{
			System.out.print("X");
		}
		System.out.println();
		star +=2;
	}
	}
}
