package in.acts.cdac;

import java.util.Scanner;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;
	static int a =10;
	
	public Book () {
		this.title = title;
		this.author= author;
		this.publisher= publisher;
		this.isbn=isbn;
		this.year=year;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter and setter methods for isbn
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter and setter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and setter methods for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and setter methods for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int increaseQuantity(int quantity,int a) {
    	quantity = quantity +a;
    	return quantity;
    }
    
    public int decreaseQuantity(int quantity,int a) {
    	quantity = quantity -a;
    	return quantity;
    }
    
    public static double getInventoryValue(double price,int quantity) {
    	double value = price * quantity;
    	return value;
    }

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Title:");
		String title = sc.nextLine();
		System.out.println("Author:");
		String author = sc.nextLine();
		System.out.println("Publisher:");
		String publisher = sc.nextLine();
		System.out.println("ISBN No.:");
		String isbn = sc.nextLine();
		System.out.println("Year:");
		int year = sc.nextInt();
		System.out.println("Price:");
		double price = sc.nextDouble();
		System.out.println("Quantity:");
		int quantity = sc.nextInt();
		
		Book b = new Book();
		
		int incqnt = b.increaseQuantity(quantity,a);
		int decqnt = b.decreaseQuantity(quantity,a);
		double value = getInventoryValue(price,quantity);
		
		System.out.println("Increased Qty is "+incqnt);
		System.out.println("Decrease Qty is "+decqnt);
		System.out.println("Value is "+value);
	}

}
