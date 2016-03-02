package algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = 0l; // big sum should always be LONGGGGG
		for (int arr_i = 0; arr_i < n; arr_i++) {
			sum = sum + in.nextInt();

		}
		System.out.println(sum);
		in.close();
	}

}
