class NS 
{
	void nonstatic()
	{
		System.out.println("This is a non static method in cls A");
	}	
}


class SM
{
	public static void main ( String [] args)
	{
		NS A = new NS();
		A.nonstatic();
	}
}