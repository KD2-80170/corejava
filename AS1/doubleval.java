package javaas1;

import java.util.Scanner;

public class doubleval {


		public static void main(String[] args) {
			Scanner Sc = new Scanner(System.in);
			double numOne = 0, numTwo = 0;
			int flag = 0;

			System.out.println("Enter  number 1");

			if (!Sc.hasNextInt()) {
				numOne = Sc.nextDouble();

				System.out.println("Enter  number 2");
				if (!Sc.hasNextInt()) {
					numTwo = Sc.nextDouble();
					System.out.println("Average is "+(numOne+numTwo)/2);

				} else {
					System.out.println("Other than float");
					
				}

			} else {
				System.out.println("Other than float");
			}

		}
	}