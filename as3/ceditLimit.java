package as3;
import java.util.*;
public class ceditLimit {
  private int beginingBalance;
  private int charges;
  private int credit;
  private  int newBalance;
 
   public ceditLimit() {
	super();
	this.beginingBalance = beginingBalance;
	this.charges = charges;
	this.credit = credit;
	this.newBalance = newBalance;
}

/*account number
	b) balance at the beginning of the month
	c) total of all items charged by the customer this month
	d) total of all credits applied to the customer’s account this month
	e) allowed credit limit.*/
   public int getBeginingBalance() {
	return beginingBalance;
}

public void setBeginingBalance(int beginingBalance) {
	this.beginingBalance = beginingBalance;
}

public int getCharges() {
	return charges;
}

public void setCharges(int charges) {
	this.charges = charges;
}

public int getCredit() {
	return credit;
}

public void setCredit(int credit) {
	this.credit = credit;
}

public int getNewBalance() {
	return newBalance;
}

public void setNewBalance(int newBalance) {
	this.newBalance = newBalance;
}

public static void main(String args[])
   {
	
	ceditLimit cl=new ceditLimit();
  Scanner sc =new Scanner(System.in);
       System.out.println("enter  Bigining balance");
        int beginingBalance=sc.nextInt();
        System.out.println("enter totl month charges");
        int charges=sc.nextInt();
        System.out.println("enter  total credit");
        int credit = sc.nextInt();
        int newBalance;
        
       
        newBalance = (( beginingBalance + charges )-credit);
        System.out.println("new balance is"+ newBalance);
        if( newBalance>credit)
        {
        	System.out.println("Credit limit exceeded");
        }
        else
        {
         System.out.println("Credit limit exceeded");
        
        }
        
        
        
 }

		

}
