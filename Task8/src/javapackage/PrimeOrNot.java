package javapackage;

import java.util.Scanner;

public class PrimeOrNot {
 //Q.5: java program to check the given number is prime or not
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n==0 || n==1) {
			System.out.println(n +" is not a prime");
		}
		if(n==2) {
			System.out.println(n +" is a prime");
			
		}
		else { 
				if(n%2 != 0) {
					System.out.println(n+" is a prime");
				}
				else {
					System.out.println(n+ " is not a prime");
				}
			}
		}
	}