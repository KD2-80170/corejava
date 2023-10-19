import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treseteg {


	public static void main(String[] args)
	{
		Set<Book> set=new TreeSet<>();
		set.add(new Book("5","hrishikesh",23,34.45));
		set.add(new Book("4","hemant",24,35.45));
		set.add(new Book("7","komal",25,40.45));
		set.add(new Book("8","kavya",26,56.45));
		set.add(new Book("8","yash",27,78.45));
		
		Iterator<Book> it=set.iterator();
		 while(it.hasNext())
		 {
			Book k=it.next();
			System.out.println(k); //if two duplicate value enter then it will take  first entry only 
			 
		 }
		
			
			
		 
	}

}
