class Atm 
{
	public static void main(String[] args) 
	{
		int fixamount = 3500;
		int amount = 2800;
		int oramount = 2800;
		
		if (amount>=2000)
		{
			System.out.println("2000 = " + amount/2000);
			amount %= 2000;
		}
		if(amount>=500)
		{
			System.out.println("500 = " + amount/500);
			amount%=500;
		}
		if(amount>=200)
		{
			System.out.println("200 = " + amount/200);
		    amount%=200;
		}
		if(amount >= 100)
		{
			System.out.println("100 = " + amount/100);
		}
		int remaining = fixamount - oramount;
		//System.out.println(fixamount + "-" + amount + "=" + remaining);
		System.out.println("Remaining blnc = " + remaining);
	}
}
