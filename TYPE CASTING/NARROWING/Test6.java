class Test6 
{
	public static char m1(int n)
	{
		return(char)n;//norrowing
	}
	public static void main(String[] args) 
	{
		System.out.println(m1(65));
	}
}
