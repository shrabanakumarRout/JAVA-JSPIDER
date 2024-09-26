import java.util.Scanner;

class HappyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		do{
			while(n>0){
				int digit=n%10;
				sum+=digit*digit;
				n/=10;
			}
			n=sum;
			sum=0;
		}while(n!=1 && n!=4);
		if(n==1)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}
