package com.day1;

import java.util.Scanner;

public class program3 {

	
	       public static void main(String[] args) {
	           Scanner scanner = new Scanner(System.in);
	           System.out.print("Enter a number: ");
	           int num = scanner.nextInt();
	           int factorial = 1;

	           for (int i = 1; i <= num; i++) {
	               factorial *= i;
	           }

	           System.out.println("Factorial of " + num + " is " + factorial);
	       }

}

