import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkhashset {

	public linkhashset() {}
// in LinkHahSet if there duplicate value is remove but out show 
	//as we inserted the value and no sorting is happen even you use equal method or not
		
		public static void main(String args[])
		{
		Set<Book> set=  new LinkedHashSet<>();
			
			 set.add(new Book("1","harshal",5,3000.00));
	         set.add(new Book("2","hrishikeh",10,4000.00));
	         set.add(new Book("9","Ram",15,5000.00));
	         set.add(new Book("4","shikhar",20,6000.00));
	         set.add(new Book("1","harshal",25,7000.00));
	         
			Iterator<Book> it=set.iterator();
			{
				while(it.hasNext())
				{  Book b=it.next();
					System.out.println(b);
				}
			}
			 
		}  
		// TODO Auto-generated constructor stub
	

}
