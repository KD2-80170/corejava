import java.util.Objects;
import java.util.Scanner;

public class Book {

     private String isbn;
     private String authors;
     private int quantity;
     private double price;
	public Book() {
	
	}
	public Book(String isbn, String authors,  int quantity, double price) {
		super();
		this.isbn = isbn;
		this.authors = authors;

		this.quantity = quantity;
		this.price = price;
	}
	

public void accept()
   {
	  Scanner s=new Scanner(System.in);
	   System.out.println("enter isbn");
	   isbn=s.next();
	   System.out.println("enter authors");
	   authors=s.next();
	 
	   System.out.println("enter quantity");
	   quantity=s.nextInt();
	   System.out.println("enter price");
	   price=s.nextDouble();
   }
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getAuthors() {
	return authors;
}
public void setAuthors(String authors) {
	this.authors = authors;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", authors=" + authors + ", quantity=" + quantity + ", price="
			+ price + "]";
}


//@Override
//public int hashCode()
//{ int hash=Objects.hash(this.isbn);
 // return hash;
	//}

@Override
public int hashCode() {
return Objects.hash(isbn);
  }


   @Override
    public boolean equals(Object obj) {
	  if (this == obj)
		return true;
	  if (obj == null)
		return false;
	  if (getClass() != obj.getClass())
		return false;
	  Book other = (Book) obj;
	  return Objects.equals(isbn, other.isbn);}
}

   

