class Student 
{
	String name;
	int age;
	int roll;
	long number;
	
	Student(String name,int age,int roll,long number)
	{
		this.name = name ;
		this.age = age;
		this.roll = roll;
		this.number = number;
	}
	
	public void Display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(roll);
		System.out.println(number);
	}
		
	public static void main(String[] args) 
	{
		Student s1 = new Student ("Simpul",24,1,9087654321L);
		Student s2 = new Student("Ankita",25,2,9807654321L);
		Student s3 = new Student("Rintu",25,3,9870654321L);
		
		s1.Display();
		s2.Display();
		s3.Display();
	}
}
