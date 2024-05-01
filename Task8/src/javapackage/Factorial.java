package javapackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Q.6: Java program to print factorial of the given number
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			fact = fact*i;  //if the number is 3 then fact = 1*1 = 1 then 1*2 = 2 (now the fact became 2) fact = 2*3(next num) = 6 , thus 3! = 6
		}
		
		System.out.println("Factorial of "+ n +" is "+  fact);
	}

}
