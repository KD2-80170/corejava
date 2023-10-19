import java.util.Objects;
import java.util.Scanner;

public class Student {

     private int rollno;
     private String name;
     private  String division;
	
	
	public Student() {
		
	}

	public Student(int rollno, String name, String division) {
		
		this.rollno = rollno;
		this.name = name;
		this.division = division;
	}
	
	public void accept()
	{
		System.out.println("enter rollno");
		this.rollno=new Scanner(System.in).nextInt();

		System.out.println("enter name");
		this.name=new Scanner(System.in).next();

		System.out.println("enter division");
		this.division=new Scanner(System.in).next();
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(rollno);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(rollno, other.rollno);
//	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", division=" + division + "]";
	}
     
     
     
     
     
     
}
	
	