package solutions.implementation;

import java.util.Scanner;

//QUESIONG : https://www.hackerrank.com/challenges/sherlock-and-squares

public class SherlockAndSquares {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int totalCases = in.nextInt();

		for (int i = 0; i < totalCases; i++) {
			int lowerLimit = in.nextInt();
			int upperLimit = in.nextInt();
			// both are whole 3, 7
			// lower is whole upper is decimal 3 , 7.15
			// lower is decimal upper is whole 3.12 , 7
			// both are decimal 3.12 , 7.15

			double sqLowerLimit = Math.sqrt(lowerLimit);
			double sqUpperLimit = Math.sqrt(upperLimit);
			double upperLt = Math.floor(sqUpperLimit);
			double lowerLt = Math.ceil(sqLowerLimit);
			System.out.println(((int) (upperLt - lowerLt)) + 1);
		}
		in.close();

	}
}
