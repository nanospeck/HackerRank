package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;

public class Panagrams {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int numericValue = Character.getNumericValue(c);
			set.add(numericValue);
		}
		if (set.size() == 27)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
		in.close();
	}

}
