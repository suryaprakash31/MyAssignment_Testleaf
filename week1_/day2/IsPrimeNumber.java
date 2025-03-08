package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {
	public static void main(String[] args) {
		
		//Getting the Input from User
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the Number: ");
		int number = scan.nextInt();
		
		//Initializing a variable to calculate count
		int count = 0;
		
		//Initializing the For Loop to iterate the number from 1 to Number and check it was divisible by 1 and the number
		for(int i = 1; i<=number;i++) {
			if(number%i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("The Given number " + number + " is a prime number");
		}
		else {
			System.out.println("The Given number " + number + " is a not prime number");
		}
	}
	
	
	
}