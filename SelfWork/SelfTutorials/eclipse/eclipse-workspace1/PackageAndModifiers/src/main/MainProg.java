package main;

/*
 * Packages topic
 * 
 * like a folder in a project where all codes are contained for a project
 * 
 * Access modifier: control where you can access the methods and variables
 * 
 * static: non access modifier
 * 
 * */

import java.util.Scanner; // a built in package
import java.text.DecimalFormat;
import math.*; 

public class MainProg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		boolean cont = true;
		
		while (cont) {
			
		}
		
		while (cont) {
          System.out.println("Continue program? y/n  ");
          String choice = input.nextLine().toLowerCase();
          
          if (choice.equals("n")) {
              System.out.println("ByeBye :)");
              cont = false;
          } else if (choice.equals("y")) {
              System.out.print("Enter num1: ");
              int n1 = input.nextInt();

              System.out.print("Enter num2: ");
              int n2 = input.nextInt();

              input.nextLine();
              
              boolean contOperation = true;
              while(contOperation) {
         
            	  System.out.print("Choose operation (+, -, *, /, %): ");
            	  String operation = input.nextLine();
            	  
            	  int num = 0; 
            	  
            	  switch (operation) {
            	  case "+":num = twoNumCalc.sum(n1, n2);break;
            	  case "-":num = twoNumCalc.diff(n1, n2);break;
            	  case "*":num = twoNumCalc.prod(n1, n2);break;
            	  case "/":num = twoNumCalc.quo(n1, n2);break;
            	  case "%":num = twoNumCalc.remainder(n1, n2);break;
            	  default:System.out.println("Operation does not exist."); contOperation=true;
            	  }
            	  
            	  printRes(num);
            	  contOperation = false;
              }
          } else {
              System.out.println("Invalid input. Please enter y or n.");
          }
      }
		input.close();
	}
	
	public static void printRes(int n) {
		DecimalFormat df = new DecimalFormat("###,###.00");
		System.out.println("\nResult is: " + df.format(n) + "\n");
	}
}

