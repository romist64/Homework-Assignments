package javaHomework4_2_Proj;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] adjective = {"Explosive", "Rock", "Metal", "Elemental", "Autonomous", "Smart", "Stinky", "Goopy", "Sticky", "Long", "Superfluous", "Useless", "Heated", "Cooled", "Hidden"};
		String[] idea = {"Knowledge", "Hole", "Joke", "Hot", "Cold", "Travel", "Internet", "Connection", "Idea", "Bike", "Hull", "Car", "Aeroplane", "Jet", "Rocket"};
		String[] object = {"Rice", "Missile", "Rock", "Hat", "Device", "Doohickey", "Computer", "Stick", "Armour", "Anvil", "Cup", "Continent", "Planet"};
		Scanner sombre = new Scanner(System.in);
		System.out.print("How many product names do you want?\r\n"
				+ "-------------------------\r\n"
				+ "Enter a number: > ");
		int num = sombre.nextInt();
		sombre.close();
		System.out.println("\nThe 5 generated products!\n-------------------------");
		for(int i = 0; i < num; i++) {
			System.out.println(adjective[(int) (Math.random()*adjective.length)]+" "+idea[(int) (Math.random()*idea.length)]+" "+object[(int) (Math.random()*object.length)]);
		}
	}
}
