package algorithms.implementation;

import java.util.Scanner;

import algorithms.common.Common;


//Solution for https://www.hackerrank.com/challenges/find-digits


public class FindDigitsDivisible {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		Integer totalCases = in.nextInt();
		//System.out.println(totalCases);
		for (int i = 0; i < totalCases; i++) {
			int value = in.nextInt();
			calculateAndPrintDivisibility(value);
		}
		in.close();
	}

	private static void calculateAndPrintDivisibility(int value) {

		// NEW: Created a common library to store frequently used methods
		int digits[] = Common.converDigitToArray(value);
		int divisible =0;
		for(int digit : digits){
			if (digit!=0&&value%digit==0)
				divisible++;
				
		}
		System.out.println(divisible);

	}
}
