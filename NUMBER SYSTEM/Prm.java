import java.util.Scanner;
class Prm 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Starting num");
		int St =sc.nextInt();
		System.out.println("Enter The Ending num");
		int end =sc.nextInt();
		for (int i=St;i<=end ;i++ )
		{
			boolean Flag =true;
			if (i<=1)
			{
				Flag=false;
			}else{
			for (int j=2;j<=i/2 ;j++ )
			{
				if (i%j==0)
				{
					Flag = false;
					break;
				}
			}
			}
			if (Flag)
			{
				System.out.println(i);
			}
		}
			
			
			
	}
}
