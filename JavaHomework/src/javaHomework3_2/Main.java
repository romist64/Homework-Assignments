package javaHomework3_2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sombre = new Scanner(System.in);
		System.out.print("choose a number 100-999: ");
		int j = sombre.nextInt();
		sombre.close();
		for(int i = 1; i <= j; i++) {
			if(i%13 == 0) {
				System.out.println(i);
			}
		}
	}
}
