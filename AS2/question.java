package as2java;

import java.util.Scanner;

public class question {
	String fname;
	String lname;
	float salary;
	public question(String fname, String lname, float salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		if(salary<0)
		{this.salary=0;}
		else {
		this.salary = (float) (salary *1.1);}
	}
	public static void main(String args[]) 
	{
		question e = new question();
	 e.setFname("mahesh");
	 e.setLname("sonawane");
	 e.setSalary(3000);
	System.out.println("firt name is"+" "+ e.getFname());
	 System.out.println("last name is"+" "+e.getLname());
	System.out.println("salary is"+" "+e.getSalary());
	String f;
    String l;
    float sal;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter first name");
    f=sc.next();
    e.setFname(f);
    System.out.println("enter last  name");
    l=sc.next();
    e.setLname(l);
    System.out.println("enter salary");
    sal=sc.nextFloat();
     e.setSalary(sal);
     System.out.println("firt name is"+" "+ e.getFname());
	 System.out.println("last name is"+" "+e.getLname());
	System.out.println("salary is"+" "+e.getSalary());
 
	
		
	}
	
}

