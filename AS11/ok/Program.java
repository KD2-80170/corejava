package ok;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Program {

	public Program() {}
  public static void main(String args[])
  {
	 Student[] s=new Student[5];
	  s[0]=new Student(5,"suhas","Aurangabad",23.4);
	  s[1]=new Student(2,"mahi","Ahmadnagar",24.4);
	  s[2]=new Student(3,"samir","dharashiv",200.4);
	  s[3]=new Student(4,"sameer","Aurangabad",100.4);
	  s[4]=new Student(1,"Akash","pune",45.4);
	   
	  System.out.println("before sort");
	  
	  for(Student k:s)
	  {System.out.println(k);
	  }
	  

	  
	  class EmpNameSalComparator implements Comparator<Student> {
			@Override
			public int compare(Student e1, Student e2) {
				int diff = -( e1.getCity().compareTo(e2.getCity()));
				if(diff == 0)
					diff = -(Double.compare(e1.getMarks(), e2.getMarks()));
				if(diff==0)
					diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		}
		EmpNameSalComparator comparator = new EmpNameSalComparator();
		//ArrayList.sort();
		Arrays.sort(s, comparator);
		System.out.println("After Sort by Name, Sal: ");
		for (Student e : s)		
			System.out.println(e);
	}

	  
	  
  }
	


