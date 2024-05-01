package javapackage;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		// Q.10: java program to count number of digits in an integer
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
        int n = sc.nextInt();
		//System.out.println("The number of digits in the given integer is " +String.valueOf(n).length());
        int count = 0;
        while(n>0) {
        	n = n/10;
        	count++;
        }
        System.out.println("The number of digits in the given integer is "+ count); 			
	}
}
