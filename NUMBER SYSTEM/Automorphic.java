import java.util.Scanner;
class Automorphic 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the first no");
	 int st = sc.nextInt();
		 
	 System.out.println("Enter the last no");
	 int end=sc.nextInt();
	 
	 for (int i=st;i<=end;i++)
	 {
		 int n = i;
		 int sqt = i*i;
		 boolean flag=true;
		 
		 while(n>0)
		 {
			 if(n%10 != sqt%10)
			 {
				 flag=false;
				 break;
			 }
			 
			 n/= 10;
			 sqt/=10;
		 }
		 if(flag)
		 {
			 System.out.println(i);
		 }
	 }
	}
}
