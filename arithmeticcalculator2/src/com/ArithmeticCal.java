package com;
import java.util.Scanner;

public class ArithmeticCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 char operator;
	     Double number1, number2, result;
	     Scanner input = new Scanner(System.in);
	     System.out.println("Choose an operator: +,-,*,/");
	     operator = input.next().charAt(0);
	     System.out.println("Enter the first number");
	     number1 = input.nextDouble();
	     System.out.println("Enter the second number");
	     number2 = input.nextDouble();

	    switch (operator) {

	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + "+" + number2 + "=" + result);
	        break;

	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + "-" + number2 + "=" + result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + "*" + number2 + "=" + result);
	        break;

	      
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + "/" + number2 + "=" + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
	}



		