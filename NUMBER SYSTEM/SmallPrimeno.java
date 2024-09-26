import java.util.Scanner;
class SmallPrimeno 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int st = sc.nextInt();
		System.out.println("Enter the range");
		int end = sc.nextInt();
		for(int j = st;j<=end;j++)
			{
			boolean flag = true;
            if(j>1)
				{
				for(int i = 2;i<=j/2;i++)
					{
					if(j%i==0)
						{
						flag = false;
						break;
						}
					}
					}
					if(flag)
					{
						System.out.print("the smallest prime no in the range is:" + j);
						
						break;
					}
						
					
			}
	}
}
