class Ac 
{
	int curtemp;
	
	void increasetemp()
	{
		curtemp++ ;
	}
	
	public static void main(String[] args) 
	{
		Ac ac1 = new Ac();
		Ac ac2 = new Ac();
		
		ac1.increasetemp();
		System.out.println ( ac1.curtemp);
		ac2.increasetemp();
		System.out.println ( ac2.curtemp);
		
	}
}
