package algorithms.implementation;

import java.util.Scanner;

//QUESTION : https://www.hackerrank.com/challenges/sherlock-and-squares

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
			boolean isUpperWhole = false;
			boolean isLowerWhole = false;
			double sqLowerLimit = Math.sqrt(lowerLimit);
			double sqUpperLimit = Math.sqrt(upperLimit);
			if (sqUpperLimit % 1 == 0) {
				isUpperWhole = true;
			}
			if (sqLowerLimit % 1 == 0) {
				isLowerWhole = true;
			}
			// case 1
			if (isUpperWhole && isLowerWhole) {

				System.out.println(((int) (sqUpperLimit - sqLowerLimit)) + 1);
			}
			// case 2
			else if (!isUpperWhole && isLowerWhole) {
				double upperLt = Math.floor(sqUpperLimit);
				System.out.println(((int) (upperLt - sqLowerLimit)) + 1);
			}
			// case 3
			else if (!isLowerWhole && isUpperWhole) {
				double lowerLt = Math.ceil(sqLowerLimit);
				System.out.println(((int) (sqUpperLimit - lowerLt)) + 1);
			}
			// case 4
			else if (!isLowerWhole && !isUpperWhole) {
				double upperLt = Math.floor(sqUpperLimit);
				double lowerLt = Math.ceil(sqLowerLimit);
				System.out.println(((int) (upperLt - lowerLt)) + 1);
			}

		}
		in.close();

	}
}
