class Number 
{
	int num;
	
	boolean isPrime()
	{
		if(num<=1) return false;
		for (int i=2;i<=num/2;i++)
		{
			if (num%i==0)return false;
		}
		System.out.println(num + " num is prime " );
				return true;
			
    }
	
		
	 boolean isPerfect()
	 { 
		 int sum = 0 ;
		 for (int i=1;i<=num/2;i++)
		 {
			 if(num%i == 0) sum+=i;
		 }
	 
	  System.out.println(num + " is perfect no " );
		 return sum == num ;
     }
}	
	class Test5
	{
	  public static void main(String[] args) 
	{
		Number n1 = new Number();
		n1.num = 5;
		n1.isPrime();
		n1.isPerfect();
	}
}
