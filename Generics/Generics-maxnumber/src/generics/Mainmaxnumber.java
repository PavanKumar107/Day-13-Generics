package generics;

import java.util.Scanner;

public class Mainmaxnumber {
	public static void main(String[] args) {
		Testmaxnumber max = new Testmaxnumber();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int first = scan.nextInt();

		System.out.println("Enter Second Number: ");
		int second = scan.nextInt();

		System.out.println("Enter Third Number: ");
		int third = scan.nextInt();

		max.maxInt(first, second, third);
	}
}
