import java.util.Scanner;
class A9
// sum of odd and even digit of a no
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); //4875
		int esum = 0;
		int osum = 0;
		int store=0;
			while (n>0)
			{
				store = n%10;// in 1st itr 5 , 7 , 8 ,4
				
	             if(store % 2 == 0){
					 esum+=store;   //8 ,4
				 }
				else{
					osum+=store; //5+7
					}
					n=n/10;   //487 , 48 ,4
			}
			    System.out.println(esum);
				System.out.println(osum);
	}
}
