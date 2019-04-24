package lab4;

import java.util.Scanner;

public class lab4 {
	public static void main(String[] args) {

		double userNum, beginNumber, square, cube;
		char answer = 'y';

		Scanner scan = new Scanner(System.in);
		
		while (answer == 'y') {
		System.out.println("Please enter a number to be squared and cubed");
		userNum = scan.nextInt();
		beginNumber = userNum;

		

			for (beginNumber = 1; beginNumber <= userNum; beginNumber++) {
				square = Math.pow(beginNumber, 2);
				cube = Math.pow(beginNumber, 3);
				System.out.println(beginNumber + " Squared " + square + " Cubed " + cube);

				if (beginNumber == userNum) {
					System.out.println("Would you like to go again? y for yes, n for no.");
					answer = scan.next().charAt(0);
				

					
				}
			}
		}scan.close();

	}
}