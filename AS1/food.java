package javaas1;

import java.util.Scanner;

public class food {
	public static void main(String[] args)
	{ int choice;
	int d=0;
	int sa=0;
	int i=0;
	int a=0;
	int b=0;
	int c=0;
		Scanner sc =new Scanner(System.in);
	while((choice=menu())!=0)
	{  
	   if(choice==1)
	   { 
		System.out.println("enter quantity");
		a= sc.nextInt();
		 d=a*40;  
	    }
	   
	   if(choice==2)
	   {  
		System.out.println("enter quantity");
	    b= sc.nextInt();	 
		  i=50*b;     
		 }
	   
	   if(choice==3)
	   {  
		System.out.println("enter quantity");
		c= sc.nextInt(); 
		 sa=10*c;
		 }
	   
	   if(choice==4)
	   {   System.out.println("dosa quantity is ="+a+" "+"total price = "+d);
	   System.out.println("idali Quantity is ="+b+" "+" total price "+i);
	   System.out.println("dosa is ="+c+" "+"price is "+sa);
	  System.out.println("total bill is equal to ="+(d+i+sa)+" "+"Rupee");     }    
	    }
		
		
	}
	static int menu()
	{
		Scanner s =new Scanner(System.in);
		int choice;
		System.out.println("enter food item");
		System.out.println("1.dosa price 40");
		System.out.println("2.for idali  price 50");
		System.out.println("3.for samosa price 10");
		System.out.println("4.generate bill");
		
		 choice =s.nextInt();
		return choice;
	}

}
