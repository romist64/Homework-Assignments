package javaHomework2_3;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sombre = new Scanner(System.in);
		System.out.print("Enter the hour in military time (1-24): ");
		int hour = Integer.valueOf(sombre.nextLine());
		if(hour >= 18 && hour <= 24){
			System.out.println("Good evening");
		}else if(hour >= 12){
			System.out.println("Good afternoon");
		}else if(hour >= 6 && hour <= 0){
			System.out.println("Good morning");
		}else{
			System.out.println("Good day");
		}
		sombre.close();
	}
}