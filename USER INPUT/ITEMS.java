import java.util.Scanner;
class ITEMS 
{
	static int Rice = 20;
    static double Dal = 50.50;
	static int chips = 50; 
	public static void g()
	{
    System.out.println("Available grocery in the shop");

	System.out.println("1.Rice \n2.Dal\n3.Chips ");
	System.out.println ("Rice" + " " + 40);
    System.out.println ("Dal" + " " + 120);
	System.out.println ("Chips" + " " + 50);
	System.out.println("---------------------------------What you want to buy----------------------------");
    Scanner Sc = new Scanner(System.in);
	System.out.println("amount of rice uhh want in KG :-");
    int r = Sc.nextInt();
	System.out.println("--------your Bill---------");
	String bill = Sc.nextLine();
	System.out.println(r * ITEMS.Rice);
	}
}
