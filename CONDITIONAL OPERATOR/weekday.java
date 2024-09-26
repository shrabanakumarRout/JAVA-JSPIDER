import java.util.Scanner;
class weekday 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the day number");
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		switch(a){
			case 1:System.out.println("SUNDAY");
			break;
			case 2:System.out.println("MONDAY");
			break;
			case 3:System.out.println("TUESDAY");
			break;
			case 4:System.out.println("WEDNESDAY");
			break;
			case 5:System.out.println("THURSDAY");
			break;
			case 6:System.out.println("FRIDAY");
			break;
			case 7:System.out.println("SATURDAY");
			default:System.out.println("Error:Invalid Input"); 
		}
	}
}
