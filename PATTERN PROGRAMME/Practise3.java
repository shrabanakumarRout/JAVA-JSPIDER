/*  X
   X X
  X X X
 X X X X
X X X X X  */ 
class Practise3 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for (int k=1;k<=i;k++)
			{
				System.out.print("X ");
			}
		
			System.out.println(" ");
			
		}
	}
}
