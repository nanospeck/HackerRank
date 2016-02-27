package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

   	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int threshold = in.nextInt();
			int a[] = new int[n];
			int validStudentsCounter = 0;
			for (int a_i = 0; a_i < n; a_i++) {
				int timeEntered = in.nextInt();
				a[a_i] = timeEntered;
				if (timeEntered <= 0) {
					validStudentsCounter++;
				}

			}
			if (validStudentsCounter >= threshold)
				System.out.println("NO");
			else
				System.out.println("YES");
                //System.out.println("Valid students:"+validStudentsCounter);
                //System.out.println("Threshold:"+threshold);
				//1,2,9,1,5,2,6,9
			//

		}
		in.close();
	}

}
