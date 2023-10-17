package com.app.fruits;

import java.util.Scanner;

public class Fruit {
 
	 String name ;
	 double  weight;   
	 String color;
	  boolean isFresh ;
	  public Fruit() {
			this(" ",0," ");
			// TODO Auto-generated constructor stub
		}
	  
	public Fruit(String name, double weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	
	}
	
	
	@Override
	public String toString() {
		return "Fruit [color=" + name + ", weight=" + weight + ", name=" + color + " ]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public String test()
	{return "specific test";}
	

	
}



