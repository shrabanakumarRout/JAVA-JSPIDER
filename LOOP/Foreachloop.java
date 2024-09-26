class Foreachloop
{
	public static void main(String[] args) 
	{
		int[]a = {10,20,30,40};
	
	System.out.println("using traditonal for loop");
	System.out.println(a[0]);
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("using for each loop");
		for(int n:a)
		{
			System.out.println(n);
		}
	}
}