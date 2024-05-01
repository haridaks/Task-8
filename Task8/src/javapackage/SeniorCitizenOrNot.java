package javapackage;

import java.util.Scanner;
//Q.9
public class SeniorCitizenOrNot {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your age: ");
	  int age = sc.nextInt();

	  if(age >= 60) {
		  System.out.println("You are a senior citizen");
	  }
	  else {
		  System.out.println("You are not a senior citizen");
	  }
     
	}

}
