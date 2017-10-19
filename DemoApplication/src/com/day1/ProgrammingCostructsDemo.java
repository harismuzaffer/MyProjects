package com.day1;

import java.util.Scanner;

public class ProgrammingCostructsDemo {

	public static void main(String[] args) {
		int choice = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Absolute");
			System.out.println("2. Factorial");
			System.out.println("3. Palindrome");
			System.out.println("4. Exit");
			System.out.println(" Enter your choice ");
			choice = sc.nextInt();
			if (choice >= 1 && choice <= 3) {
				System.out.println("Enter the number");
				num = sc.nextInt();
			}
			switch (choice) {
			case 1:
				if (num < 0) {
					num = -num;
				}
				System.out.println("The absolute value of the given number is "
						+ num);
				break;
			case 2:
				int f = 1;
				for (int i = 1; i <= num; i++)
					f = f * i;
				System.out.println("The factorial of the given number is " + f);
				break;
			case 3:
				int rev = 0,
				temp = num;
				while (num > 0) {
					rev = rev * 10 + num % 10;
					num = num / 10;
				}
				if (rev == temp)
					System.out.println("The given number is Palindrome");
				else
					System.out.println("The given number is not Palindrome");
				break;
			case 4:
				System.out.println("Exiting the application ......");
				System.exit(0);

			}
		} while (choice > 0 && choice < 5);
	}

}
