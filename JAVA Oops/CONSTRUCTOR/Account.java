class Account
{
	String name;
	int age;
	int money;
	long number;
	
	Account(String name,int age,int money,long number)
	{
		this.name = name;
		this.age = age;
		this.money = money;
		this.number = number;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(money);
		System.out.println(number);
	}
		
		public static void main(String[] args) 
	{
		Account a1 = new Account("Simpul",22,2000,7852913488L);
		a1.display();
	}
}