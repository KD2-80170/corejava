import java.util.Scanner;

public class Labour extends Employee{
  
     private double salary;
	void accept()
	{
		super.accept();
		System.out.println("enter salary");
		salary=new Scanner(System.in).nextDouble();
	}
	void display()
	{
		super.display();
	}
     
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void totsalary() 
    {
   	 System.out.println("show salary"+salary);
    } 
     
}
