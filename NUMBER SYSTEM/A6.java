import java.util.Scanner;
//  Check Even or Odd
class A6
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	     
		while (n>0 || n==0){
			if(n%2==0){
				System.out.println( n +" " +"is even number");
				break;
			}
					else{
						System.out.println(n + " " + "is odd number");
						break;
					}
		
		}
	}
}
