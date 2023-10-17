package com.app.fruits;

import java.util.Scanner;

public class Pragram {
	
	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int choice;
	 int count=0;
	 System.out.println("enter bucket size");
	  int size = s.nextInt();
	 Fruit[] Basket = new Fruit[size];
	do{
	System.out.println("0.exit");
    System.out.println("1.add Mango");
	System.out.println("2.add Orange");
	System.out.println("3.add Apple");
	System.out.println("4.display name of all fruit in bucket");
	System.out.println("5.display name ,weight,color and test of all fruit in bucket");
    System.out.println("6.mark fruit as fresh or stale");
	 choice =new Scanner(System.in).nextInt();

        
        switch(choice)
        {
        case 1: if(size>count)
        {  
             String name; 
             double weight;
             String color;
             System.out.println("enter name");
             name=s.next();
             System.out.println("enter weight");
             weight=s.nextDouble();
             System.out.println("enter color");
             color=s.next();
        	Basket[count]=new Mango(name,weight,color);
        	count++;
        }
        else
        {   System.out.println("size of bucket is full");}
        break;
        	
        case 2:
               if(size>count) 
               {
            String name; 
            double weight;
            String color;
            System.out.println("enter name");
            name=s.next();
            System.out.println("enter weight");
            weight=s.nextDouble();
            System.out.println("enter color");
            color=s.next();
       	    Basket[count]=new Orange(name,weight,color);
         	count++;
               }
               else
               {System.out.println("bucket size is full");}
        break;
        case 3:
               if(size>count)
               {
            String name; 
            double weight;
            String color;
            System.out.println("enter name");
            name=s.next();
            System.out.println("enter weight");
            weight=s.nextDouble();
            System.out.println("enter color");
            color=s.next();
       	     Basket[count]=new Orange(name,weight,color);
         	count++;
               }
               else
               {
            	   System.out.println("bucket size is full");
               }
        break;
        	
        case 4:{
        	
               for(Fruit ak:Basket)
               {
            	   System.out.println("name of all fruit is"+ ak.getName() +"   "+"test of fruit"+"="+ak.test());
               }
        }
        	
        break;
        case 5:
        	 for(Fruit i:Basket)
        	 {
        		 System.out.println("name of  fruit is"+i.getName());
        		 System.out.println("color of  fruit is"+i.getColor());
        		 System.out.println(" fresh or not of  fruit is"+i.isFresh());
        		 System.out.println(" weight   fruit is"+i.getWeight());
      
        		 
        	 }
        	break;
        case 6:
        	System.out.println("enter index of fruit is declare as  stale ");
        	      int z= new Scanner(System.in).nextInt();
        	      for(int i=0;i<=size;i++)
        	       {     if(i==z) {
        	    	  Basket[i].setFresh(false);
                 System.out.println("mark food as stale");
        	       }
        	   
        	       }      
        break;
       
        	
        default:
        System.out.println("Enter correct choice ");
        break;
        	  
        	  
        	  
        	  
       }}while(choice!=0);
	
          
          
          
}}
