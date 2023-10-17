package javaas1;
import java.util.*;
public class numtoboh {
	
	
	
	 public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to convert binary octal hex ");
		  int a= sc.nextInt();
		System.out.println("binary of number"+" "+a+" "+"="+Integer.toBinaryString(a));
		System.out.println("octal  of number"+" "+a+"is"+"="+Integer.toOctalString(a));
		System.out.println("hexadecimal  of number"+" "+a+"is"+"="+Integer.toHexString(a));
		

	}}



