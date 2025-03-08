package week1.day2;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		//Getting the input from user
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the range of Fibanacci Series: ");
		int n = scan1.nextInt();
		//Initializing the prefixed values
		int a1 = 0;
		int a2 = 1;
		System.out.print(a1 + " ");
		System.out.print(a2 + " ");
		
		//Initializing the for loop to run from i = 2 to lesser than a number
		for (int i = 2; i<n;i++) {
			int a3 = a1+a2;
			System.out.print(a3 + " ");
			a1=a2;
			a2=a3;
		}

	}

}

/*
 a1 = 0
 a2 = 1
 
 0 1 
 
 for i = 2;
 a3 = 0+1
 
 0 1 1
 a1 = 1
 a2 = 1
 
 for i = 3
 a3 = 1 + 1 
  0 1 1 2
  a1 = 1
  a2 = 2
  
 for i = 4 
 a3 = 1+2
 0 1 1 2 3
 
 a1 = 2
 a2 = 3
 
 for i = 5
 a3 = 2+3 
 0 1 1 2 3 5
 
 a1 = 3
 a2 = 5
 
 for i = 6
 a3 = 3+5
 
 0 1 1 2 3 5 8 
 
 a1 = 5
 a2 = 8
 .
 ..
 ...
 
  
 */
