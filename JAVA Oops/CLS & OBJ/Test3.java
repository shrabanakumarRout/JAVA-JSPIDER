class Account 
{
    int bal;
	
	void displaybal()
	{
		System.out.println("curr bal = " + bal);
	}
	
	void withdraw(int amt)
	{
		if(amt>bal)
		{
		System.out.println(" failed IB");
		return;
	    }
	  // Withdraw logic;
	  bal-=amt;
	  System.out.println ( amt + "withdrawn");
    }

}
   class Test3
   {
	public static void main(String[] args) 
	{
		Account a1 = new Account();
		a1.bal = 5000;
		a1.displaybal();
		a1.withdraw(2476);
		a1.displaybal();
	}
}
