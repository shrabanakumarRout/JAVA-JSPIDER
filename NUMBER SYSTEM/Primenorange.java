import java.util.Scanner;
class Primenorange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int m = sc.nextInt();
		System.out.println("Enter the  Ending number");
		int n = sc.nextInt();
        for(int i=m;i<=n;i++)
		{
		boolean Flag = true;
		if(i<=1)
			{
			Flag = false;
			}
			else{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				Flag = false;
				break;
				}
		      }
			}
		     if(Flag)
			{
			System.out.println(i);
			}
		
		}
	}	
	
}
