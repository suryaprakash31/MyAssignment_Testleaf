package week3.day1;

import java.util.Iterator;
import java.util.Scanner;

public class OddIndextoUppercase {

	public static void main(String[] args) {
		//Getting input from the user
		Scanner string = new Scanner(System.in);
		System.out.print("Enter the String Name: ");
		String test = string.next();
		
		//Convert String into LowerCase, inCase user gives an input in capital
		String lowerCase = test.toLowerCase();
		System.out.println("String Before Changing: " + lowerCase);
		
		//Converting String into CharArray
		char[] charArray = lowerCase.toCharArray();
		System.out.println("String After changing the odd Index to Uppercase: ");
		
		//Iterating the CharArry
		for (int i = 0; i < charArray.length; i++) {
			
			if(i % 2 == 1) {
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);
			}
			else {
				System.out.print(charArray[i]);
			}
		}
		
		
		
	}

}
