package javaHomework7x8_Proj;
import java.util.Scanner;

import javaHomework7x8_Proj.Slot.Fruits;

public class Project8 {
	public static void main(String[] args) {
		boolean arbitrary = true;
		SlotMachine oneArm = new SlotMachine();
		double money = 1000;
		Scanner sombre = new Scanner(System.in);
		System.out.println("Welcome to the BoJangles Sponsored Online Slot Machine!!");
		System.out.println("You have been given a starting loan of $1000. Can YOU make it to 1 Million?");
		System.out.println(oneArm.toString());
		oneArm.setSlotOne(2);
		oneArm.setSlotTwo(2);
		while(arbitrary) {
			// start game, give ui stats
			System.out.println("Money: $"+money);
			// spin, see if wins
			System.out.print("How much would you like to bet? ");
			double bet = sombre.nextDouble();
			sombre.nextLine();
			boolean arbitrary2 = true;
			while(arbitrary2) {
				if(bet > money) {
					System.out.println("You dont have the money for that!");
				}else {
					arbitrary2 = false;
				}
			}
			oneArm.spin();
			System.out.println(oneArm.toString());
			// give/take money
			if(oneArm.seeSlotOne().currentSlot() == oneArm.seeSlotTwo().currentSlot() || oneArm.seeSlotOne().currentSlot() == oneArm.seeSlotThree().currentSlot()) {
				if(oneArm.seeSlotOne().currentSlot() == Fruits.Cherry){
					bet *= 1.5;
				}else if(oneArm.seeSlotOne().currentSlot() == Fruits.Lemon){
					bet *= 2;
				}else {
					bet *= 3;
				}
			}else if(oneArm.seeSlotTwo().currentSlot() == oneArm.seeSlotThree().currentSlot()) {
				if(oneArm.seeSlotTwo().currentSlot() == Fruits.Cherry){
					bet *= 1.5;
				}else if(oneArm.seeSlotTwo().currentSlot() == Fruits.Lemon){
					bet *= 1.5;
				}else {
					bet *= 1.5;
				}
			}else {
				bet *= -1;
			}
			money += bet;
			// round money to two decimal places
			money = money*100;
			money = Math.round(money);
			money = money/100;
			// close game if no money or player wants to
			if(money <= 0) {
				System.out.println("Aw, man! You're terrible at gambling! Make sure you repay your debt at your BoJangles Official Debt Officer. Or they will report to you.");
				arbitrary = false;
			}else {
				System.out.println("Would you like to stop now? (Y/N) ");
				if(sombre.nextLine().equalsIgnoreCase("y")) {
					arbitrary = false;
					System.out.println("Congrats! You made it out with $"+money+"!!");
					System.out.println("If you are still indebted, please report to your BoJangles Official Debt Officer. Or they will report to you.");
				}
			}
		}
		sombre.close();
	}
}
