class Student 
{
	String name;
	int password;
	Student(String name,int password)
	{
		name =Simpul;
		password = 0;
	}
}

class userupdate
{
	void changepassword(Student pass)
	{
		Student.password=12345;
		System.out.println("Student password change " + " " + 12345);
	}
		
}

class Test6
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Simpul",54321);
		System.out.println(s1.password);
		userupdate u1 = new userupdate();
		u1.changepassword(s1);
		System.out.println(s1.password);
		
	}
}
