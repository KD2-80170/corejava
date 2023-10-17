
public class program {

	public program() {
		// TODO Auto-generated constructor stub
	}
   public static void main(String args[])
   {
	  Labour e=new Labour();
	   e. accept();
	   e.display();
	   
	   
	   Box<Labour> b1=new Box<>();
           b1.setObj(e);
	System.out.println("salary is"+b1.getSalary());
	   
   Manager e3=new Manager();
	   e3. accept();
	   e3.display();
	   
	   
	   Box<Manager> b2=new Box<>();
        b2.setObj(e3);
	System.out.println("salary is"+b2.getSalary());
	   
	  
	Salesman e2=new Salesman();
	   e2. accept();
	   e2.display();
	   
	   
	   Box<Salesman> b3=new Box<>();
        b3.setObj(e2);
	System.out.println("salary is"+b3.getSalary());
	   
	  
	  
	  
	    
	    
	   
	   
   }
}
