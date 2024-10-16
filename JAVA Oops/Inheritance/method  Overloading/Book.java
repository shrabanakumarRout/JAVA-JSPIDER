import java.util.Scanner;

public class Book{ 
	String name ;
	String author;
	double price;
	
    Book(String name,String author,double price){
		this.name = name;
		this.author=author;
		this.price=price;
	}

public void display() {
	System.out.println(name+ " " + author+ " " + price);
}
public static Book createBook(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Book Name");
	String name = sc.nextLine();
	String author = sc.nextLine();
	double price = sc.nextDouble();
	return new Book(name,author,price);
}
}