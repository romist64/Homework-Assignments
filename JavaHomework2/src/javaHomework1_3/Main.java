package javaHomework1_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float width;
		float length;
		float price;
		Scanner sombre = new Scanner(System.in);
		System.out.print("How wide is the room in feet? (Can be decimal) ");
		width = sombre.nextFloat();
		sombre.nextLine();
		System.out.print("How long is the room in feet? (Can be decimal) ");
		length = sombre.nextFloat();
		sombre.nextLine();
		System.out.print("How much does one tile cost? (Can be decimal) ");
		price = sombre.nextFloat();
		sombre.close();
		System.out.println("The room is "+(length*width)+" square feet.");
		System.out.println("It costs $"+((((double)((int)((length*width*price)*100)))/100))+" dollars to fill.");
	}
}