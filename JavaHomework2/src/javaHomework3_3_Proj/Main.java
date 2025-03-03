package javaHomework3_3_Proj;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean toggle = true;
		System.out.println("Think of a number between 1 and 1000.");
		System.out.println("After each guess, tell it if it is low, high, or there:");
		System.out.println("High (H)");
		System.out.println("Low (L)");
		System.out.println("Got it (G)");
		int num = 1000;
		int guessNum=1000;
		num = (int) Math.ceil(num/2.0);
		guessNum = (guessNum-num);
		Scanner sombre = new Scanner(System.in);
		while(toggle) {
			System.out.println("Is your number "+(guessNum)+"?");
			System.out.println(num);
			System.out.println(num/2);
			System.out.println(Math.floor(num/2.0));
			System.out.println(Math.ceil(num/2.0));
			String input = sombre.nextLine();
			if(input.equalsIgnoreCase("L")) {
				num = (int) Math.floor(num/2.0);
				guessNum += num;
			}else if(input.equalsIgnoreCase("H")) {
				num = (int) Math.ceil(num/2.0);
				guessNum -= num;
			}else if(input.equalsIgnoreCase("G")) {
				for(int i = 1; i <= guessNum; i++) {
					System.out.println((guessNum)+" Hip Hip Hooray!");
				}
				toggle = false;
			}
		}
		sombre.close();
	}
}