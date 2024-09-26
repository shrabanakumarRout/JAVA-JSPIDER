class Student 
{
	String name;
	int age;
	long number;
	
	Student(String name,int age,long number)
	{
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	Student(Student n)
	{
		this.name = n.name;
		this.age = n.age;
		this.number = n.number;
	}

  public void Display()
  {
	  System.out.println(name + "\n" + age + "\n" + number+"\n");
  }
}
	 class Admin
	 { 
	public static void main(String[] args) 
	{
		Student s1 = new Student("Simpul",22,7852913498L);
		s1.Display();
		Student s2 = new Student(s1);
		s2.name = "Rintu";
		s2.Display();
	}
}
