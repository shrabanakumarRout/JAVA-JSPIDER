class Rectangle  
{
	int length;
	int breadth;
	
	void SetDimensions(int l , int b)
	{
		length = l;
		breadth = b;
	}
	
	void DisplayDimensions()
	{
		System.out.println("length:+" + length +" " +  "breadth:-" + breadth );
	}
	
	void DisplayArea()
	{
		System.out.println( "Area" + " " + length * breadth);
	}
}
	
	class Test4
    {
	 public static void main(String[] args) 
	  {
		 Rectangle R1 = new Rectangle ();
		 R1.SetDimensions(30,40);
		 R1.DisplayDimensions();
		 R1.DisplayArea();
	  }
    }
