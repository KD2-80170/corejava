import java.util.Scanner;

abstract class Employee  {
   
	private String name; 

	public String getName() {
		return name;
	}
      abstract public void totsalary();

	public Employee() {
		super();
		
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		
	}
	
	
	
	





	public void setName(String name) {
		this.name = name;
	}


	void accept()
	{  System.out.println("enter name ");
	     name=new Scanner(System.in).next();
	    
	}
	
	void display()
	{
		System.out.println("name  is =   "+name);
	}    
     
}
