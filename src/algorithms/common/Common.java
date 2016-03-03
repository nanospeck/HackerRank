package algorithms.common;

public class Common {
	
	/*To convert a given integer value to an array of integer value*/
	public static int[] converDigitToArray(int value) {

		int array[] = new int[10];
		int i = 0;
		while (value != 0) {
			array[i++] = value % 10;
			value = value / 10;
		}
		return array;
	}
	
	/*Check if a given number is a whole number*/
	public static boolean isWholeNumber(double d){
		return d%1==0;
	}
	
	public static String readString(Scanner input){
		return input.nextLine();
	}

}
