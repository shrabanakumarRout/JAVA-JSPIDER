class Account 
{
	int blnc;
	
	public static void main(String[] args) 
	{
		Account a1 = new Account ();
		a1.blnc = 5000;
		 System.out.println(a1.blnc);
		 Account a2 = a1;
		 System.out.println(a2.blnc);
	}
}
