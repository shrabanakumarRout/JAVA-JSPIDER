import java.util.Scanner ;
class cash
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your money");
		Scanner sc = new Scanner (System.in);
		int amount = sc.nextInt();
		if (amount>=2000)
		{
			System.out.println("2000 *" +(amount/2000));
			amount %= 2000;
		}
		if( amount >= 500)
		{
			System.out.println("500 *"+(amount/500));
			amount %= 500;
		}
		if (amount>=200)
		{
			System.out.println("200 *" +(amount/200));
			amount%= 200;
		}
			if (amount>=100 )
			{
				System.out.println("100 *" +(amount/100));
				amount%=100;
			}
			
	}
}
