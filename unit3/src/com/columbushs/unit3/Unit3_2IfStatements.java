package com.columbushs.unit3;

import java.util.Scanner;

public class Unit3_2IfStatements {
	public void ifTesting() {
		// if (something is true) {Do this}

		int howOld = 35;
		System.out.println("Are you old?");

		if (howOld >= 40) {
			System.out.println("Yes you're old.");
		}
	}


	public void saySomething() {
		Scanner inputInfo = new Scanner(System.in);
		System.out.print("What do you want to say?");
		String talking = inputInfo.next();
		talking += inputInfo.nextLine();

		if (talking.length() < 2) {
			System.out.println("You must say more than a letter.");
			saySomething();
		}
		if (talking.length() >= 2) {
			System.out.println("Thank you for saying something.");
			System.out.println("This is what you said: " + talking);
		}

//		if (talking.length()>=2 && !talking.equals("applesauce")) {
//			System.out.println("You have not said the secret word. Try again.");
//			saySomething();
//		}
//		if (talking.length()>=2 && talking.equals("applesauce")) {
//			System.out.println("You have said the secret word. Congratulations!!!");
//		}
	}
}
