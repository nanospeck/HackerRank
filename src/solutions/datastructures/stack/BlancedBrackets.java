package solutions.datastructures.stack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/balanced-brackets/problem

*/
public class BlancedBrackets {

	static class Node {
		public char value;
		public Node next;

		Node(char v) {
			this.value = v;
		}
	}

	static Node first = null;

	public static char pop() {
		char c = first.value;
		first = first.next;
		return c;
	}

	//remember that this parameter name is node and not 'next'
	public static void push(Node node) {
		if (first != null) {
			node.next = first;
			first = node;
		} else {
			first = node;
		}
	}

	public char getTop() {
		return first.value;
	}

	// Complete the isBalanced function below.
	static String isBalanced(String s) {
		// will get previous case remaining brackets if you don't reset top
		first = null;
		// char and int cannot be used because they are not Object, Object
		// java did not have Generics in the begenning
		HashMap<Character, Character> mapOpen = new HashMap<Character, Character>();
		// store values {, }, (, ), [, ]
		mapOpen.put('{', '}');
		mapOpen.put('(', ')');
		mapOpen.put('[', ']');

		char[] list = s.toCharArray();

		for (char v : list) {
			if (mapOpen.get(v) != null) {
				push(new Node(v));
			} else if ((first != null) && (mapOpen.get(first.value) == v)) {
				pop();
			} else {
				return "NO";
			}
		}
		return first == null ? "YES" : "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// String result = isBalanced("{{[[(())]]}}");
		// System.out.println(result);
		HACKER_RANK_JUNK();
	}

	private static void HACKER_RANK_JUNK() throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\java_dev\\akhil\\out.txt"));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String s = scanner.nextLine();
			System.out.println(s);
			String result = isBalanced(s);

			bufferedWriter.write(result);
			System.out.println(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
