class Student 
{
	String name;
	int password;
	Student(String name,int pass)
	{
		this.name = name;
		password = pass;
	}
}

class userupdate
{
	void changepass(Student pass)
	{
		pass.password=12345;
		pass.name= pass.name;
		System.out.println("Student password change to  = " + pass.password + pass.name);
	}
		
}

class Test7
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Simpul",54321);
		System.out.println("your older password " + s1.password);
		userupdate u1 = new userupdate();
		u1.changepass(s1);
		System.out.println("Your new password " + s1.password);
		
	}
}
