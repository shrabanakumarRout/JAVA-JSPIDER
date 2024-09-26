class B  
{
	int i;
	int j;
	
	B()
	{
		i= 10 ;
		System.out.println(i);
		
	}
	
    B(int arg)
	{
		this();
		j = arg;
	} 
	
} 

class Test3
{
	
	public static void main(String[] args) 
	{
		
		B b2 = new B(20);
		System.out.println(b2.j);
		
	}
}
