package solutions.algorithms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import solutions.common.Common;

public class SearchBinary {

	public static void main(String[] s) {

		process(new int[] { 1, 2, 3, 5, 6, 7, 34, 54, 56 }, 1);
	}

	private static int process(int[] list, int element) {
		int positionFound = binarySearch(list, element);
		System.out.println("List: " + Arrays.toString(list));
		System.out.println("Posistion of " + element + " is : " + positionFound);
		return positionFound;
	}

	private static int binarySearch(int[] list, int element) {
		int start = 0;
		int end = list.length;
		int max = list.length;
		int mid = end / 2;

		while (mid < max) {
			if (list[mid] == element)
				return mid;
			else if (element < list[mid]) {
				end = mid;
				mid = (end - start) / 2;
			} else if (element > list[mid]) {
				start = mid;
				mid = (end - start) / 2;
			}
		}
		return -1;
	}

	
	@Test
	public void testNormal() {
		//Assert.assertEquals(4,SearchBinary.process(new int[] { 1, 2, 3, 5, 6, 7, 34, 54, 56 }, 6));
		Assert.assertEquals(1,SearchBinary.process(new int[] { 1, 2, 3, 5, 6, 7, 34, 54, 56 }, 1));
		Assert.assertEquals(1,SearchBinary.process(new int[] { 1, 2, 3, 5, 6, 7, 34, 54, 56 }, 56));
	}
}
