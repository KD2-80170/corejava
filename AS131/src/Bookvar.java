import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bookvar {


	public static void main(String[] args) {
		 Set<Book> set=new HashSet<>();
		
         set.add(new Book("1","harshal",5,3000.00));
         set.add(new Book("2","hrishikeh",10,4000.00));
         set.add(new Book("9","Ram",15,5000.00));
         set.add(new Book("4","shikhar",20,6000.00));
         set.add(new Book("1","harshal",25,7000.00));
         
        Iterator<Book> it=set.iterator();
        while(it.hasNext())
        {
        	Book b= it.next();
        	System.out.println(b);
        	//without equal method and hashcode it will return show all 
        	//duplicate value.but if we use hash code and equal mehod then 
        	//it will dont show duplicate entry at nce
        }
	}

}
