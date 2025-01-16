package javaHomework;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sombre = new Scanner(System.in);
		System.out.println("How many sales do you wish to perform?");
		int Sales = sombre.nextInt();
		System.out.println("How many days do you have?");
		int Days = sombre.nextInt();
		System.out.print("You have to sell ");
		System.out.print((double)Sales/(double)Days);
		System.out.println(" sales per day.");
	}
}
