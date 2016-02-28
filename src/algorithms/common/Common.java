package algorithms.common;

public class Common {
	
	//TODO: Put this function to a common location and make as a library to do it
	public static int[] converDigitToArray(int value) {

		int array[] = new int[10];
		int i = 0;
		while (value != 0) {
			array[i++] = value % 10;
			value = value / 10;
		}
		return array;
	}

}
