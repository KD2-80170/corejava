package as2java;

import java.util.Scanner;

public class Date {
	
  int day;
  int month;
  int year;
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Date() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
}
   void accept()
   {
	 Scanner sc =new Scanner(System.in); 
	 System.out.println("enter day month and year");
	 day=sc.nextInt();
	 month=sc.nextInt();
	 year=sc.nextInt();
	 
   }
  void display()
  {  System.out.println("date is "+" "+this.day+"/"+month+"/"+year);  }
  public static void main(String args[])
  {
	  Date d=new Date();
	  d.accept();
	  d.display();
	 
	  
  }
  
}
