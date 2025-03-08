package week1.day2;

public class Palindrome {
	
	public void checkpalidrome(int number) {
		int rev;
		int output = 0;
		int input = number;
		while (number > 0) {
			rev = number % 10; // 123 % 10 = 3
			output = (output * 10) + rev; // 0 * 10 + 3 = 3
			number = number / 10; // 123/10 = 12 
		}
		if (input == output) {
			System.out.println("The given number " + input + " and the reversed number " + output
					+ " is same. Hence the given number " + input + " is Palindrome");
		} else {
			System.out.println("The given number " + input + " and the reversed number " + output
					+ " is Not same. Hence the given number " + input + " is Not a Palindrome");
		}

	}
	public static void main(String[] args) {
		Palindrome check = new Palindrome();
		check.checkpalidrome(12121);
	}


}
