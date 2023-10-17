import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bookmain {
public Bookmain() {}
	static Scanner sc=new Scanner(System.in);
	
	static void menu()
    { 
  	System.out.println("0.Enter for Exit");  
  	System.out.println("1.Add new book in list.");  
  	System.out.println("2.Display all books in forward order.");  
  	System.out.println("3.Delete at book given index -- list.remove(index);");  
  	System.out.println("4.Check if book with given isbn is in list or not");  
  	System.out.println("5.Delete all books in list");  
  	System.out.println("6. Display number of books in list");  
  	System.out.println("7. Sort all books by price in desc order -- list.sort();");  
  	
    }
	
	
	public static void main(String args[])
	{  
	   int choice;
		List<Book> list =new ArrayList<>();
	do {
		menu();
		
		choice=sc.nextInt();
		   
	switch(choice)
	{	
	case 1:{
		    Book b =new Book();
		    b.accept();//add book
		   list.add(b);
	     }
		break;
	case 2:
	      { for(Book bk:list)
	      {
	    	  System.out.println(bk);
	      }
	       }
		break;
	case 3: 
	     {
	    	 System.out.println("enter index of book");
	    	 int index=sc.nextInt();
		   list.remove(index);
		
	      }
	break;
	case 4:
	     {System.out.println("enter isbn");
	     String k=sc.next();
	     Book key =new Book();
	         key.setIsbn(k);
	     if(list.contains(key))
	     {
	    	System.out.println("Found"); 
	     }
	     else
	     {
	    	System.out.println("Not Found"); 
	     }
	      }
		break;
	case 5:
	     {
		    list.clear();
	     }
		break;
	case 6:
	      {
	    	  System.out.println("size of list is"+list.size());
		
	       }
	    break;
	    
	 case 7:
	 {
		 class bookcopare implements Comparator<Book>
		 {
			 public int  compare(Book b1,Book b2)
			 {
			 int diff= Double.compare(b1.getPrice(),b2.getPrice());
			 return diff;
			 }
		 }
	 
	     bookcopare cp=new bookcopare();
	     list.sort(cp);
	     System.out.println("list is "+list);
	    }
		break;
		default:
			System.out.println("enter correct choice");
			break;
	    
	}
	}while(choice!=0);
	}
	}
	


