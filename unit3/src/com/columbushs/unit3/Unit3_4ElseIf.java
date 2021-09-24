package com.columbushs.unit3;

import java.util.Scanner;

public class Unit3_4ElseIf {
	public void saySomething() {
		Scanner inputInfo = new Scanner(System.in);
		System.out.print("What do you want to say?");
		String talking = inputInfo.next();
		talking += inputInfo.nextLine();

		// else ifs are all connected.
		// If the first one triggers the others do not even if they are true.

		if (talking.length() >= 2) {
			System.out.println("Thank you for saying something.");
			System.out.println("This is what you said: " + talking);
		} else {
			System.out.println("Please say more than 1 letter.");
		}

		if (talking.length() >= 2 && !talking.equals("applesauce")) {
			System.out.println("You have not said the secret word. Try again.");
			saySomething();
		} else if (talking.equals("applesauce")) { // This clause is unnecessary anyways
			System.out.println("You have said the secret word. Congratulations!!!");
		}
	}
}
