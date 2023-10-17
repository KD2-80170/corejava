package javaas1;

import java.util.Scanner;

/*Java
Explore
Sure, I can try to explain the code that you wrote in Java. Here is a line-by-line explanation of your code:

Java
This code is AI-generated. Review and use carefully. Visit our FAQ for more information.

// Declare a package name as as2java
package as2java;

// Import the java.util package that contains classes and interfaces for collections, dates, and other utilities
import java.util.*;

// Define a public class named InvoiceTest*/
public class asd {
	
	// Declare four instance variables of type int, String, int, and double
	int partno;
	String pdesc;
	int quant;
	double price;
	

	// Define a comment that describes the purpose of the class
	//An Invoice should include four pieces of information as fields—a part number
	//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
	//price per item (double). Your class should have a constructor

	// Define a default constructor that calls the super class constructor
	public asd() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Define a parameterized constructor that takes four arguments and assigns them to the instance variables
	public asd(int partno, String pdesc, int quant, double price) {
		//super();
		this.partno = partno;
		this.pdesc = pdesc;
		this.quant = quant;
		this.price = price;
	}
	
	
	// Define a getter method for the partno variable that returns its value
	public int getPartno() {
		return partno;
	}

	// Define a setter method for the partno variable that takes an argument and assigns it to the variable
	public void setPartno(int partno) {
		this.partno = partno;
	}
	
	// Define a getter method for the pdesc variable that returns its value
	public String getPdesc() {
		return pdesc;
	}

	// Define a setter method for the pdesc variable that takes an argument and assigns it to the variable
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}


	// Define a getter method for the quant variable that returns its value
	public int getQuant() {
		
		return this.quant;
	}


	// Define a setter method for the quant variable that takes an argument and checks if it is positive
	public  void setQuant(int quant) {
		
		if(this.quant>=0)
		{	
		 // If the argument is positive, assign it to the variable
		 this.quant = quant;
		}
		else
		{
		 // If the argument is not positive, assign 0 to the variable
		
		this.quant=0;}
		
	}


    // Define a getter method for the price variable that returns its value
	public double getPrice() {
		
	    return this.price;
    }

    // Define a setter method for the price variable that takes an argument and checks if it is positive
	public void setPrice(double price) {
		
	    if(price>0)
	    {
	     // If the argument is positive, assign it to the variable
	     this.price = price;
	    }
	    else
	    {
	     // If the argument is not positive, assign 0 to the variable
	     this.price=0;
	    }
    }

    // Define a method named invoicebill that calculates and prints the invoice amount for each product entered by the user
    void invoicebill()
    {
        // Print a message to ask the user to enter the number of products
        System.out.println("enter number of product");
        
        // Create a Scanner object to read input from the keyboard
        Scanner sc =new Scanner(System.in);
        
        // Read an integer from the user and store it in a variable named n
        int n=sc.nextInt();
        
        // Declare an integer variable named i and initialize it to 0
        int i=0;
        
        // Use a while loop to repeat until i is equal to n
        while(i<n){ 
        
            // Print a message to ask the user to enter the part number of the product
            System.out.println("enter part no ");
            
            // Read an integer from the user and store it in the partno variable using the setter method
            partno =sc.nextInt();
            
            // Print a message to ask the user to enter the part description of the product
            System.out.println("part description");
            
            // Read a string from the user and store it in the pdesc variable using the setter method
            sc.next();
            pdesc =sc.nextLine();
            
            // Print a message to ask the user to enter the quantity of the product
            System.out.println("enter quantity");
            
            // Read an integer from the user and store it in the quant variable using the setter method
            quant =sc.nextInt();
             setQuant(quant);
        	//if(quant<0)
        		//{   this.quant=0;
        		
        		
      		//}
     
        		 // If the argument is not positive, assign 0 to the variable
            // Print a message to ask the user to enter the price of the product 
            System.out.println("enter price");
            
            // Read a double from the user and store it in the price variable using the setter method
            price=sc.nextDouble();
            
            if(price <0)
    		{   this.price=0;
    		
;        		}
            
            // Increment the value of i by 1
            ++i;
            System.out.println("invoce bill for"+"product"+" "+" ="+((getPrice())*getQuant())+"rupee");
            // Print a message to show the invoice amount for the product by multiplying the price and quantity using the getter methods
            
        }
    }
       
  
    // Define the main method that is the entry point of the program
	public static void main(String[] args) {
	
	    // Create an object of the InvoiceTest class named k using the default constructor
		asd k=new asd();
		k.invoicebill();
		// Call the invoicebill method on the object k
	
		
		
		// TODO Auto-generated method stub
		
	}
}
