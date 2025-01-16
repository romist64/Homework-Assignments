package javaHomework2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int hours;
		String company;
		Scanner sombre = new Scanner(System.in);
		System.out.println("Hello! Please input the amount of hours you have worked.");
		hours = Integer.parseInt(sombre.nextLine());
		System.out.println("What is the company you worked under?");
		company = sombre.nextLine();
		sombre.close();
		System.out.println("\n\n");
		System.out.println("Brianna Watt DBA Watt Gives");
		System.out.println("Invoice for "+company);
		System.out.println("Rate: $30.65");
		System.out.println("Total: $"+(30.65*hours));
	}
}