
public class Salesman  extends Employee{
	 private double salary;
	public Salesman() {
		// TODO Auto-generated constructor stub
	}
		
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	void accept()
	{
		super.accept();
	}
	void display()
	{
		super.display();
	}
	public void totsalary()
	{
		System.out.println("salesman salary is"+salary);
	}
	
}
