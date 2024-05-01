package javapackage;

import java.util.Scanner;
//Q.2
public class If_Statement_ToFindEvenNumber {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter any number to know it is even or not: ");
	  int a = sc.nextInt();
	  
		if(a%2 == 0) {
			System.out.println(a +" is an even number");
			}
		else {
			System.out.println(a +" is not an even number");
		}
		
	}

}
