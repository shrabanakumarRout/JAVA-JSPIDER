import java.util.Scanner;
class yearday 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the month");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the Year");
		int b = sc.nextInt();
		switch(a){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
	    case 12:System.out.println("31 Days");
		break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30 days");
		break;
		
		            case 2:
	                if((b%100==0) || (b%4==0 && b%100!=0))
		          {
		                      System.out.println("29 days");
				  }
		    else{
			              System.out.println("28 days");
			            }
		            break;
		        
		default :System.out.println("Invalid Operator");
	}
	}
}


