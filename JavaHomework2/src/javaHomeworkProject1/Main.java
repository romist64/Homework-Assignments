package javaHomeworkProject1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sombre = new Scanner(System.in);
		String name;
		Character mid;
		Character last;
		int first;
		int second;
		System.out.print("What is your first name? ");
		name = sombre.nextLine();
		System.out.print("What is your middle initial? ");
		mid = sombre.nextLine().charAt(0);
		System.out.print("What is your last initial? ");
		last = sombre.nextLine().charAt(0);;
		System.out.print("What is your first favorite number? ");
		first = sombre.nextInt();
		System.out.print("What is your second favorite number? ");
		second = sombre.nextInt();
		System.out.println(first+second);
		System.out.println(first-second);
		System.out.println(first*second);
		System.out.println(first/second);
	}
}