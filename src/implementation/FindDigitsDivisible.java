package implementation;

import java.util.Scanner;


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

		int digits[] = converDigitToArray(value);
		int divisible =0;
		for(int digit : digits){
			if (digit!=0&&value%digit==0)
				divisible++;
				
		}
		System.out.println(divisible);

	}

	//TODO: Put this function to a common location and make as a library to do it
	//TODO: Also add a function to print int array to this lib
	private static int[] converDigitToArray(int value) {

		int array[] = new int[10];
		int i = 0;
		while (value != 0) {
			array[i++] = value % 10;
			value = value / 10;
		}
		return array;
	}
}
