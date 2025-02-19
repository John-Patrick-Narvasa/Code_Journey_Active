package main;
/*

define packages
create 
create classes in program
import the created packages

familiarized in different access and non access modifiers
creating program instantiation
 
* */

import java.util.Scanner;
import java.text.DecimalFormat;
import math.*;

public class MainProgram {
	public static int number = 8;
	
	public static void main(String[] args) {
//		// class instantiation (process of creating an instance for OOP later called as object) INITIALIZATION
//		// of default packages (instance of a class )
//		Scanner input = new Scanner(System.in); // example of instantiation ("input" as an object)
//		DecimalFormat df = new DecimalFormat("###,###.##");
//		
//		Arithmetic a = new Arithmetic(); // instantiating my arithmetic class
//		FixedValue fv = new FixedValue();
//		
//		
//		System.out.println(a.add(6,7));
//		System.out.println(a.sub(17,7));
//		System.out.println();
//		
//		fv.PI = 1000; //PI changes to 1000 instead of 3.14
//		System.out.println("pi = " + fv.PI); // pi = 1000
//	
//		// fv.PIe = 1000; (cannot be changed anymore)
//		System.out.println("pi = " + fv.PIe);
		
		
		System.out.println(number);
		System.out.println(Arithmetic.add(5, 10));
		System.out.println(FixedValue.PIe);

		
	}
}
