/* XXXXXXX
    XXXXX
	 XXX
	  X
	      */
import java.util.Scanner;
class Practise5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the range ");
		int n = sc.nextInt();
		int space =0;
		int star = n;
	    for (int i=1;i<=n;i++)
	    {
			for (int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print("X");
			}
			System.out.println();
			space++;
			star-= 2;
	    }
		
	}
}
