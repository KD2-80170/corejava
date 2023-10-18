import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalStrLength {

	public CalStrLength() {}
		public static void main(String args[])
		{
		List<String> l =new ArrayList<>();
		  
		l.add("hrishikesh");
		l.add("himanshu");
		l.add("yash");
		l.add("harshal");
		l.add("pramod");
		
		  
		class Harshal implements Comparator<String>
		{

	       @Override
			public int compare(String arg0, String arg1) {
			int diff=  arg0.length()-arg1.length();
			return diff;
			}
	
			}
		System.out.println(l);
		System.out.println("String of max length is"+" ="+Collections.max(l,new Harshal()));
		
		}
			
		

			
	}


