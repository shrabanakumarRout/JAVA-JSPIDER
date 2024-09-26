import java.util.Scanner;
class BILL 
{      
	static int Freeunit = 0;
	public static void main(String[] args) 
	   {
		
		System.out.println("Enter your Electry units");
		Scanner sc = new Scanner(System.in);
		int unit = sc.nextInt();
		System.out.println ("Enter the arrer amount");
		int amount = sc.nextInt();
		
		if(unit <= 20 && amount == 0 )
		  {
			System.out.println("Bill IS" + BILL.Freeunit);
		  }
		  
		 if((unit>20 && unit<=70) && (amount>0))
		  {
		  unit = (unit-20);
		 int nv = unit*2+amount;
			System.out.println("Bill is" + (nv+(nv*10/100)));
		  }
		
		if ((unit>20 && unit<=70) && (amount==0))
			{
			unit = (unit-20);
		int nv = unit*2+amount;
			System.out.println("Bill is" + (nv-nv*5/100) );
		  }
		  
		
		   if((unit > 70 && unit<= 100) && (amount>0))
		{
            unit = (unit-20);
			int nv = unit*4+amount;
			System.out.println("Bill is" + (nv+(nv*10/100)));
	}
	
	if((unit > 70 && unit<= 100) && (amount==0)){
		unit = (unit-20);
			int nv = unit*4+amount;
			System.out.println("Bill is" + (nv-(nv*5/100)));
	}
	if((unit > 100 && unit<= 130) && (amount>0))
	{
		unit = (unit-20);
		int nv = unit*8+amount;
		System.out.println("Bill is" + (nv+(nv*10/100)));	
	}
	
	if((unit > 100 && unit<= 130) && (amount==0)){
        unit = (unit-20);
			int nv = unit*+amount;
			System.out.println("Bill is" + (nv-(nv*5/100)));
	
	}
}
}
