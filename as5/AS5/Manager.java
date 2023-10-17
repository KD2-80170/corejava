import java.util.Scanner;

public class Manager extends Employee{
  private double salary;
	public Manager() {
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
		System.out.println("enter manager salry");
		salary=new Scanner(System.in).nextDouble();
	}
	void display()
	{
		super.display();
	}
	public void totsalary()
	{
		System.out.println("manager salary is"+salary);
	}
	
}
