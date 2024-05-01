package javapackage;

import java.util.Scanner;

public class SwapingTwoInputNumbers {
//Q.4
	public static void main(String[] args) {
	    //To get input from user
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a: ");
	    int a = sc.nextInt();
	    System.out.println("Enter b: ");
	    int b = sc.nextInt();
	    
	    //Before swapping
	    System.out.println("Before swapping");
	    System.out.println("A = " +a);
	    System.out.println("B = " +b);
	    
	    //Swapping values using temporary variable
	    int temp = a;
	    a = b;
	    b = temp;
	    
	    //After swapping
	    System.out.println("After swapping");
	    System.out.println("A = " +a);
	    System.out.println("B = " +b);
	}

}
