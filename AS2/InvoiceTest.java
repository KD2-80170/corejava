package as2java;
import java.util.*;
public class InvoiceTest {
	
	int partno;
	String pdesc;
	 int quant;
	 double price;
	

	//An Invoice should include four pieces of information as fields—a part number
	//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
	//price per item (double). Your class should have a constructor

	public InvoiceTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceTest(int partno, String pdesc, int quant, double price) {
		//super();
		this.partno = partno;
		this.pdesc = pdesc;
		this.quant = quant;
		this.price = price;
	}
	
	
	public int getPartno() {
		return partno;
	}

	public void setPartno(int partno) {
		this.partno = partno;
	}
	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}


	public int getQuant() {
		
		return this.quant;
	}


	public  void setQuant(int quant) {
		
		if(quant>0)
		{	
		this.quant = quant;
		}
		else
		{this.quant=0;}
		
	}


	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		
		if(price>0)
		{
		this.price = price;
		}
		else
		{ this.price=0;}
	}

  void invoicebill()
  {
	  System.out.println("enter number of product");
	     Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	     int i=0;
	        while(i<n){ 
	        System.out.println("enter part no ");
	       partno =sc.nextInt();
	          System.out.println("part description");
	          sc.next();
	   	  pdesc =sc.nextLine();
	   	     System.out.println("enter quantity");
	     quant =sc.nextInt();
	     setQuant(quant);
	     	  
	   	    System.out.println("enter price");
	       price=sc.nextDouble();
	      	   setPrice(price);
	       ++i;
	  	System.out.println("invoce bill for"+"product"+" "+i+" ="+((getPrice())*getQuant())+"rupee");
	        }}
       
  
	public static void main(String[] args) {
		InvoiceTest k=new InvoiceTest();
		k.invoicebill();
		
		// TODO Auto-generated method stub
		
		
	}}

