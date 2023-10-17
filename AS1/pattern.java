package javaas1;
import java.util.*;

public class pattern {
	
	
 public static void main(String[] args)
 {     int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter nuber of row");
    n=sc.nextInt();
    
    for( int i=1;i<=n;i++)//this line for row 
    {
    	for(int j=1;j<=n-i;j++) //variable k is for spaces which is n is number of line and i is row n-i 5-1 =4 means first row give 4 spaces
    	{
    		System.out.print(" ");
    	}
    	
    	for(int k=1;k<=i;k++)//this line print coulmn 
    	{  
    		System.out.print("* "); //this line will print * column value of each row
    	}
    	System.out.println();//this line will change the next ROW 
    }
	 
	 
	 
	 
}}

