import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmapas {

	public Hashmapas() 
	{}
	
 public static void main(String[] args)
     {      int choice;
	       Scanner sc=new Scanner(System.in);
	 Map<String ,Book> map=new HashMap<>();
	    do {
	    	System.out.println("0.enter for exit");
	    	System.out.println("1.enter for insert in map");
	    	System.out.println("2.enter isbn to show book ");
	    	choice =sc.nextInt();
	    	switch(choice)
	    	{
	    	case 1:
	        Book b=new Book();
	        b.accept();
	        map.put(b.getIsbn(),b);
	        break;
	    	case 2:
	        System.out.println("enter isbn");
	    	String isbn=sc.next();
	    	Book f= map.get(isbn);
	    	System.out.println(f);
	        break;
	        default:
	        System.out.println("enter correct choice");
	    	break;
	 
	 
	    	}
	    }while(choice!=0);
     }}
