package onlinetests.timeinc;
import java.util.ArrayList;
import java.util.List;

/*
This is question asked for TIME inc, Banglore during online test round

Question Brief: Check if a given string is a palindrome. The string is allowed to have some errors,
the palindrome can still be accepted as a palindrome if the number of mismatch in characters is less than or equal to the
allowed error rate.

*/


public class PandromeWithErrorRate {

	public static void main(String[] args) {

		isPalindrome("racecar", 2);
	}

	static boolean isPalindrome(String input, int allowedErrors) {
		input = input.toUpperCase();
		char[] strChars = input.toCharArray();

		List<Character> word = new ArrayList<Character>();
		for (char c : strChars) {
			word.add(c);
		}
		int correctChars = 0;
		int incorrectChars = 0;
		for (int i = 0; i < strChars.length/2; i++) {
				if (strChars[i] == strChars[strChars.length-1-i]) {
					correctChars++;
				} else {
					incorrectChars++;
				}
		}

		if ((incorrectChars <= allowedErrors)
				&& (correctChars + incorrectChars == strChars.length/2)) {
			System.out.println("true, incorrect characters: " + incorrectChars);
			return true;
		} else {
			System.out.println("false, incorrect characters: " + incorrectChars);
			return false;
		}
	}

}
