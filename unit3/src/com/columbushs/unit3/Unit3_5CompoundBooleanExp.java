package com.columbushs.unit3;

import java.util.Scanner;

public class Unit3_5CompoundBooleanExp {

	public void nestedIfs() {

		Scanner inputInfo = new Scanner(System.in);
		System.out.print("What is the number you want to check?");
		int number = inputInfo.nextInt();

		if (number > 10) {

			if (number % 5 == 0) {
				System.out.println("The number is greater than 10 and divisible by 5.");
			} else {
				System.out.println("The number is greater than 10 but not divisible by 5.");
			}

		} else {
			System.out.println("The number is not greater than 10.");
		}
		//Careful with curly brackets and which ifs and elses go together.
	}

}
