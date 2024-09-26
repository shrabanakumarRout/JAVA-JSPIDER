class Box
{
	int height;
	int width;
	int length;
	
	Box()
	{
		
	}
	
	Box(int h,int w,int l)
	{
		height=h;
		width = w;
		length = l;
	}
	
	Box(int d)
	{
		height = d;
		width = d;
		length = d;
	}
	
	void Display()
	{
		System.out.println("height = " + height + "width ="+ width + "length =" + length);
	}
}
 
class Test2
{
	
	public static void main(String[] args) 
	{
		Box b1 = new Box();
		b1.Display();
		Box b2 = new Box(4,5,6);
		b2.Display();
		Box b3 = new Box(5);
		b3.Display();	
	}
}